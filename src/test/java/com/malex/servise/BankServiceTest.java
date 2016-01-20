package com.malex.servise;


import com.malex.configuration.AppConfig;
import com.malex.configuration.JPAConfig;
import com.malex.model.BankUtil;
import com.malex.model.entity_test.Bank;
import com.malex.model.entity_test.Worker;
import com.malex.service.BankService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Set;

import static org.junit.Assert.assertEquals;

@DirtiesContext
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JPAConfig.class, AppConfig.class})
public class BankServiceTest {

    @Autowired
    private BankService service;

    @Test
    public void testSaveBank() {
//        Bank workerExpected = BankUtil.createBank();
//        this.service.addBank(workerExpected);
        Bank bankActual = this.service.getBank((long) 1);
//        assertEquals(workerExpected, bankActual);
        System.err.println(bankActual);
    }
}
