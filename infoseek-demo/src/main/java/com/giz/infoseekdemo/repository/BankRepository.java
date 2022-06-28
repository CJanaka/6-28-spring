package com.giz.infoseekdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giz.infoseekdemo.domain.Bank;

public interface BankRepository extends JpaRepository<Bank, Long>{

}
