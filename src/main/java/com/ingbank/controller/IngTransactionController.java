package com.ingbank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ingbank.domain.Accountdetails;
import com.ingbank.domain.CustomerDomain;
import com.ingbank.domain.CustomerModel;
import com.ingbank.service.AccountService;
import com.ingbank.service.CustomerService;

@RestController
@RequestMapping("api")
public class IngTransactionController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private AccountService accountService;

	@PostMapping("/createCustomer")
	public ResponseEntity<CustomerDomain> createUser(@RequestBody CustomerDomain CustomerDomain,
			UriComponentsBuilder ucBuilder) {
		CustomerDomain u = new CustomerDomain();
		try {

			u = customerService.createCsutomer(CustomerDomain);

		} catch (Exception e) {
			e.printStackTrace();
		}

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/user}").buildAndExpand().toUri());
		return new ResponseEntity<CustomerDomain>(u, headers, HttpStatus.CREATED);

	}

	@GetMapping("/getUserList")
	public List<CustomerDomain> getUserList() {

		List<CustomerDomain> userList = new ArrayList();
		/*
		 * try { userList = userService.getList(); } catch (Exception e) { throw new
		 * SiddharthException(e.getMessage()); } return userList;
		 */

		return customerService.getAllCustomer();

	}
	
	
	@GetMapping("/findUserByID/{id}")
	public CustomerDomain getUserById(@PathVariable("id") long id) {

		List<CustomerDomain> userList = new ArrayList();
		

		return  customerService.getCustomerById(id);

	}
	
	
	@PostMapping("/createAccount")
	public ResponseEntity<Accountdetails> createAccount(@RequestBody Accountdetails Accountdetails,
			UriComponentsBuilder ucBuilder) {
		Accountdetails acnt = new Accountdetails();
		try {

			acnt = accountService.createAccount(Accountdetails);

		} catch (Exception e) {
			e.printStackTrace();
		}

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/user}").buildAndExpand().toUri());
		return new ResponseEntity<Accountdetails>(acnt, headers, HttpStatus.CREATED);
	}

}
