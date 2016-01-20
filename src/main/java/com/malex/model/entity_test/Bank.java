package com.malex.model.entity_test;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "bank_id", nullable = false)
    private Long bank_id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "bank_id")
    private Set<Worker> workerSet;

    public Set<Worker> getWorkerSet() {
        return workerSet;
    }

    public void setWorkerSet(Set<Worker> workerSet) {
        this.workerSet = workerSet;
    }

    public Bank() {
    }

    public Long getBank_id() {
        return bank_id;
    }

    public void setBank_id(Long bank_id) {
        this.bank_id = bank_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (bank_id != null ? !bank_id.equals(bank.bank_id) : bank.bank_id != null) return false;
        if (name != null ? !name.equals(bank.name) : bank.name != null) return false;
        return workerSet != null ? workerSet.equals(bank.workerSet) : bank.workerSet == null;

    }

    @Override
    public int hashCode() {
        int result = bank_id != null ? bank_id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bank_id=" + bank_id +
                ", name='" + name + '\'' +
                ", workerSet=" + workerSet +
                '}';
    }
}
