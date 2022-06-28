package com.giz.infoseekdemo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bankId;
	private String bankName;
	private Date incoperateDate;
	private int noOfStaff;
	private int noOfBranches;
	
	public Bank(String bankName, Date incoperateDate, int noOfStaff, int noOfBranches) {
		super();
		this.bankName = bankName;
		this.incoperateDate = incoperateDate;
		this.noOfStaff = noOfStaff;
		this.noOfBranches = noOfBranches;
	}
	
	
	public Bank() {
		super();
	}


	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Date getIncoperateDate() {
		return incoperateDate;
	}
	public void setIncoperateDate(Date incoperateDate) {
		this.incoperateDate = incoperateDate;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	
	
}
