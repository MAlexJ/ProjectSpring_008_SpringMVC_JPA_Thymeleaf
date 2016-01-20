package com.malex.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

//данный класс является Spring конфигурацией;
@Configuration
//включает TransactionManager для управления транзакциями БД;
@EnableTransactionManagement
// включаем возможность использования JPARepository и говорим, где их искать
@EnableJpaRepositories(basePackages = "com.malex")
public class JPAConfig {

    @Value("${data.username}")
    private String username;
    @Value("${data.password}")
    private String password;
    @Value("${data.jdbc.driver}")
    private String driver;
    @Value("${data.jdbc.url}")
    private String url;
    @Value("${data.showsql}")
    private boolean showSql;
    @Value("${data.generateddl}")
    private boolean generateDdl;
    @Value("${data.database}")
    private String database;
    @Value("${data.entitymanager.packages.to.scan}")
    private String entityManagerPackages;
    @Value("${data.hibernate.hbm2ddl}")
    private String hibernateHbm2ddl;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // register Driver: org.postgresql.Driver
        dataSource.setDriverClassName(driver);
        // register Url: jdbc:postgresql://localhost:5432/db_store_test
        dataSource.setUrl(url);
        // register username: postgres
        dataSource.setUsername(username);
        // register password: 2687484a
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setShowSql(showSql);
        jpaVendorAdapter.setGenerateDdl(generateDdl);
        jpaVendorAdapter.setDatabase(Database.valueOf(database));
        return jpaVendorAdapter;
    }

    //TODO 1: "db.hibernate.hbm2ddl.auto"
    @Bean
    public Properties jpaProperties(){
        Properties jpaProperties = new Properties();
        //TODO 2: "db.hibernate.hbm2ddl.auto"
        jpaProperties.put("hibernate.hbm2ddl.auto", hibernateHbm2ddl);
        return jpaProperties;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        // register  DataSource
        entityManagerFactory.setDataSource(dataSource());
        // register JpaVendorAdapter
        entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter());
        // register  Packages To Scan Entity
        entityManagerFactory.setPackagesToScan(entityManagerPackages);
        //TODO 3: Implements PROP_HIBERNATE_HBM2DDL_AUTO = "db.hibernate.hbm2ddl.auto"
        entityManagerFactory.setJpaProperties(jpaProperties());
        return entityManagerFactory;
    }

    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return new JpaTransactionManager();
    }
}
