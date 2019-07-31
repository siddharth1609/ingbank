package com.ingbank.service;

import java.util.List;

import com.ingbank.domain.Accountdetails;


public interface AccountService {

	public List<Accountdetails> getAccounts();
	
	public Accountdetails createAccount(Accountdetails accountdetails);

	
}
