package com.akhilesh.demo.models;


import javax.persistence.Entity;

@Entity
public class OnlineCustomer extends Customer {

	private String email;
	
	public OnlineCustomer() {
		// TODO Auto-generated constructor stub
	}

	public OnlineCustomer(Integer id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
