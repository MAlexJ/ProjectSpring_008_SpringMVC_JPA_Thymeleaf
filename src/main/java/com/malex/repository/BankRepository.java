package com.malex.repository;

import com.malex.model.entity_test.Bank;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankRepository extends JpaRepository<Bank, Long> {
}
