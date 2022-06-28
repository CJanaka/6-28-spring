package com.giz.infoseekdemo.controller;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giz.infoseekdemo.domain.Bank;
import com.giz.infoseekdemo.service.BankService;

@RestController
@RequestMapping(path = "api/v1/bank")
public class BankController {

	@Autowired
	private BankService bankService;

	public BankController(BankService bankService) {
		this.bankService = bankService;
	}

	@PostMapping
	public Bank creaateBank(@RequestBody Bank bank) {
		return bankService.createBank(bank);
	}
	
	@PutMapping(path = "{bankId}")
	public Bank updateBank(@PathVariable("bankId") long bankId, @RequestBody Bank bank) {
		return null;
	}


	@DeleteMapping(path = "{bankid}")
	public void deleteBank(@PathVariable long bankId) {

	}

	@GetMapping()
	public List<Bank> getallBanknames() {
		return bankService.getAllBanks();
	}

	@GetMapping(path = "{bankid}")
	public Bank getbankbyBankId(@PathVariable long bankid) {
		return null;
	}
}
