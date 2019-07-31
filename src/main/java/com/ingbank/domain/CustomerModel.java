package com.ingbank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name = "CUSTOMER")
public class CustomerModel {
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	
    @Column(name = "CUSTOMERID")
	private int customerId;
    
    @Column(name = "CUSTOMERNAME")
	private String customerName;
    
    @Column(name = "ACCOUNTNUMBER")
	private String accountNumber;
    
    @Column(name = "ACCOUNTBALANCE")
	private double accountbalance;
    
    @Column(name = "SECRETCODE") 
	private int secretCode;
	public CustomerModel(String customerName, int customerId, String accountNumber, double accountbalance, int secretCode) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.accountbalance = accountbalance;
		this.secretCode = secretCode;
				
		
	}



	public CustomerModel() {
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}

	public int getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(int secretCode) {
		this.secretCode = secretCode;
	}

	

	public String getCustomerName() {
		return customerName;
		
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	

}
