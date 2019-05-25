package com.akhilesh.demo.models;

import javax.persistence.Entity;

@Entity
public class Customer extends Person {
	
	private String mobileNo;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
	
	

}
