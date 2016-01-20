package com.malex.model;

import com.malex.model.entity_test.Bank;

import java.util.LinkedList;
import java.util.List;

public class BankUtil {

    public static Bank createBank() {
        Bank bank = new Bank();
        bank.setBank_id((long)1);
        bank.setName("BankFirst");
        return bank;
    }


    public static List<Bank> createBanks() {
        List<Bank> bankList = new LinkedList<>();

        return bankList;
    }
}
