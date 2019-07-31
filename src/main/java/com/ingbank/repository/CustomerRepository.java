package com.ingbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingbank.domain.CustomerDomain;
import com.ingbank.domain.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerDomain, Long> {
	
	
}
