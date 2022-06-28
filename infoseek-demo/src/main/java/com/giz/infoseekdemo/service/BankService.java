package com.giz.infoseekdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giz.infoseekdemo.domain.Bank;
import com.giz.infoseekdemo.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository bankRepository;
	
	public BankService(BankRepository bankRepository) {
		this.bankRepository = bankRepository;
	}

	public Bank createBank(Bank bank) {
		return bankRepository.save(bank);
	}
	
	public List<Bank> getAllBanks(){
		return bankRepository.findAll();
	}
}
