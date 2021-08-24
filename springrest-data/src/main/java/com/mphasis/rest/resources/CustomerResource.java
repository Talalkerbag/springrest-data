package com.mphasis.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.rest.model.Customer;
import com.mphasis.rest.services.CustomerService;


@RestController
public class CustomerResource {
	
	//CRUD create - POST, read - GET, update - PUT, delete - DELETE
	@Autowired
	CustomerService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/fetch/{id}")
	public Customer fetchCustomer(@PathVariable(value="id") Long custid) {
		return service.getCustomer(custid);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/fetch/all")
	public List<Customer> getCustomers(){
		return service.getCustomers();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/add")
	public void addCustomer(@RequestBody Customer cust) {
		service.addCustomer(cust);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/modify")
	public Customer modifyCustomer(@RequestBody Customer cust) {
		return service.updateCustomer(cust);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/remove/{id}")
	public void removeCustomer(@PathVariable(value="id") Long custid) {
		service.deleteCustomer(custid);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/fetchFullname/{fullname}")
	public List<Customer> getCustomerByName(@PathVariable(value="fullname") String fullname){
		return service.getCustomerByName(fullname);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/fetchBalance/{balance}")
	public List<Customer> getCustomerByBalance(@PathVariable(value="balance") double balance){
		return service.getCustomerByBalance(balance);
	}

}
