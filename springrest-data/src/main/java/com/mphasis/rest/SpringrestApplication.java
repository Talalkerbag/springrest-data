package com.mphasis.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mphasis.rest.model.Customer;
import com.mphasis.rest.repository.CustomerRepository;

@SpringBootApplication
@ComponentScan(basePackages= {})
public class SpringrestApplication implements CommandLineRunner{
	
	
	@Autowired
	CustomerRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		
	}
}

