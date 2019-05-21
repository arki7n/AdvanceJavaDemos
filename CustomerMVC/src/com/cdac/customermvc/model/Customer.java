package com.cdac.customermvc.model;

public class Customer {
	
	Integer customerId;
	String firstName;
	String lastName;
	String mobileNo;
	String email;
	public Customer() {
		super();
	}
	public Customer(String firstName, String lastName, String mobileNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}

	

}
