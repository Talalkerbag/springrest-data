package com.mphasis.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="custid")
	private long custId;
	@Column(name="fullname")
	private String fullName;
	@Column(name="acctbalance")
	private double balance;
	
	public Customer() {
		super();
	}

	public Customer(long custId, String fullName, double balance) {
		super();
		this.custId = custId;
		this.fullName = fullName;
		this.balance = balance;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", fullName=" + fullName + ", balance=" + balance + "]";
	}
	
	

	
	

}
