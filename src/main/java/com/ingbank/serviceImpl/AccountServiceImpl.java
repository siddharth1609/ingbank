package com.ingbank.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingbank.domain.Accountdetails;
import com.ingbank.domain.CustomerDomain;
import com.ingbank.repository.AccountRepository;
import com.ingbank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountrepository;

	@Override
	public List<Accountdetails> getAccounts() {
		List<Accountdetails> accounts = new ArrayList<Accountdetails>();

		return accounts = accountrepository.findAll();
	}

	@Override
	public Accountdetails createAccount(Accountdetails accountdetails) {

		Accountdetails acntCreate = new Accountdetails();

		return acntCreate = accountrepository.save(accountdetails);
	}

}
