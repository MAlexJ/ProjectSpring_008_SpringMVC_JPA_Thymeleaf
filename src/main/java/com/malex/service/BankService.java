package com.malex.service;

import com.malex.model.entity_test.Bank;

import java.util.List;

public interface BankService {
    void addBank(Bank bank);

    void updateBank(Bank bank);

    void deleteBank(Bank bank);

    Bank getBank(Long id);

    void addBanks(List<Bank> banks);

    List<Bank> getAllBanks();

    void deleteAll();
}
