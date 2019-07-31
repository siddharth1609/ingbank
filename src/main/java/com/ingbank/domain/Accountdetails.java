package com.ingbank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CUSTOMER_ACCNT")
public class Accountdetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "IBAN")
	private String iBan;

	@Column(name = "BALANCE")
	private double balance;

	@Column(name = "TYPE")
	private String type;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private CustomerDomain customer;


	public Accountdetails() {
		// TODO Auto-generated constructor stub
	}


	public Accountdetails(Long id, String iBan, double balance, String type, CustomerDomain customer) {
		super();
		this.id = id;
		this.iBan = iBan;
		this.balance = balance;
		this.type = type;
		this.customer = customer;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getiBan() {
		return iBan;
	}


	public void setiBan(String iBan) {
		this.iBan = iBan;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public CustomerDomain getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerDomain customer) {
		this.customer = customer;
	}
	
	
	
}