package com.mphasis.rest;

import java.util.List;

import javax.sql.DataSource;
import com.mphasis.rest.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
//@ComponentScan(basePackages= {})
public class SpringrestApplication implements CommandLineRunner{
	
	
//	@Autowired
//	CustomerRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@192.168.1.91:1521/XE");
		dataSource.setUsername("system");
		dataSource.setPassword("Ea7057abebe12");
		
		return dataSource;
	}

}

