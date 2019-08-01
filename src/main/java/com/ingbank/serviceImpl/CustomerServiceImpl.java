package com.ingbank.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingbank.domain.CustomerDomain;
import com.ingbank.domain.CustomerModel;
import com.ingbank.repository.CustomerRepository;
import com.ingbank.service.CustomerService;

@Service
public class CustomerServiceImpl  implements  CustomerService {

	@Autowired
	 private CustomerRepository  customerRepository;
	
	/*
	 * @Override public CustomerModel getCustomer(Long id) {
	 * 
	 * CustomerModel customerModel = customerRepository.getOne(id);
	 * 
	 * return customerModel; }
	 * 
	 * @Override public CustomerModel getCustomerDetails(Long id) {
	 * 
	 * //CustomerModel customerModel = customerRepository.getOne(id); CustomerModel
	 * customerModel = customerRepository.getOne(id); return customerModel; }
	 */

	@Override
	public List<CustomerDomain> getAllCustomer() {
		
		List<CustomerDomain>getAllCutomer = new ArrayList<CustomerDomain>();
		
		
		return getAllCutomer = customerRepository.findAll();
	}

	@Override
	public CustomerDomain createCsutomer(CustomerDomain customerDomain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDomain getCustomerById(Long id) {
		  CustomerDomain cs = new CustomerDomain();
		  
		 Optional<CustomerDomain> op = Optional.empty();
		   op = customerRepository.findById(id); 
		   if(op.isPresent()) { 
			   cs = op.get();
		   }
		
		return cs;
	}

	/*
	 * @Override public CustomerDomain getCustomerById(Long id) {
	 * 
	 * CustomerDomain cs = new CustomerDomain();
	 * 
	 * Optional<CustomerDomain> op = Optional.empty(); op =
	 * customerRepository.findById(id)); if(op.isPresent()) { cs = op.get();
	 * 
	 * } return cs; }
	 */


	

}
