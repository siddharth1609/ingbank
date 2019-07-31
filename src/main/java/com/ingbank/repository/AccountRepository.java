package com.ingbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingbank.domain.Accountdetails;

public interface AccountRepository extends JpaRepository<Accountdetails, Long> {

}
