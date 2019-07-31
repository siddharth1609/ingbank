package com.ingbank.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CUSTOMER")
public class CustomerDomain {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UUID")
	private Long uuid;

	@Column(name = "USERID")
	private String userId;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "EMAILID")
	private String emailId;
	
	
	//@Column(name = "GLOBAL_BALANCE")
	//private Double globalBalance;

 
    @OneToMany(mappedBy = "customer")
	private List<Accountdetails> accounts;
	
	public CustomerDomain() {
		// TODO Auto-generated constructor stub
	}

	public CustomerDomain(Long uuid, String userId, String firstName, String lastName, String address, String emailId,
			 List<Accountdetails> accounts) {
		super();
		this.uuid = uuid;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emailId = emailId;
		
		this.accounts = accounts;
	}

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

	public List<Accountdetails> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Accountdetails> accounts) {
		this.accounts = accounts;
	}
	
	
	
	
}