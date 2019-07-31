package com.ingbank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String balance;

	@Column(name = "ACCNT_TYPE")
	private String acnntType;

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

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getAcnntType() {
		return acnntType;
	}

	public void setAcnntType(String acnntType) {
		this.acnntType = acnntType;
	}

}
