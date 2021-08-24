package com.mphasis.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mphasis.rest.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByFullName(String fullName); //query
	List<Customer> findByBalance(double balance);

}
