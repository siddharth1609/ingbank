package com.ingbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ingbank.domain.CustomerDomain;
import com.ingbank.domain.CustomerModel;


public interface CustomerService {
	
	//public CustomerModel getCustomer(Long id);
	
	//public CustomerModel getCustomerDetails(Long id);
    
	public List<CustomerDomain> getAllCustomer();
	
	public CustomerDomain createCsutomer(CustomerDomain customerDomain);
	
	public CustomerDomain getCustomerById(Long id);

 
}
