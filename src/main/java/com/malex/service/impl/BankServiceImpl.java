package com.malex.service.impl;

import com.malex.model.entity_test.Bank;
import com.malex.repository.BankRepository;
import com.malex.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository repository;

    @Override
    public void addBank(Bank bank) {
        this.repository.saveAndFlush(bank);
    }

    @Override
    public void updateBank(Bank bank) {
        this.repository.saveAndFlush(bank);
    }

    @Override
    public void deleteBank(Bank bank) {
        this.repository.delete(bank);
    }

    @Override
    public Bank getBank(Long id) {
        return this.repository.findOne(id);
    }

    @Override
    public void addBanks(List<Bank> banks) {
        this.repository.save(banks);
        this.repository.flush();
    }

    @Override
    public List<Bank> getAllBanks() {
        return this.repository.findAll();
    }

    @Override
    public void deleteAll() {
        this.repository.deleteAllInBatch();
    }
}
