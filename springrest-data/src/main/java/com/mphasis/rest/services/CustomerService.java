package com.mphasis.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mphasis.rest.model.Customer;
import com.mphasis.rest.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repo;
	
	
	public Customer getCustomer(Long custId) {
		Optional<Customer> cust = repo.findById(custId);
		if(cust.isPresent()) {
			return cust.get();
		}else {
			return new Customer(404,"not found",404);
		}
	}
	
	public List<Customer> getCustomers(){
		return repo.findAll();
	}
	
	public void addCustomer(Customer newCustomer) {
		repo.save(newCustomer);
	}
	
	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	
	}
	
	public void deleteCustomer(Long id) {
		repo.deleteById(id);
	}
	
	public List<Customer> getCustomerByName(String fullname){
		List<Customer> cust = repo.findByFullName(fullname);
		if(!cust.isEmpty()) {
			return cust;
		}else {
			return null;
		}
		
	}
	
	public List<Customer> getCustomerByBalance(double balance){
		List<Customer> cust = repo.findByBalance(balance);
		if(!cust.isEmpty()) {
			return cust;
		}else {
			return null;
		}
	}

}
