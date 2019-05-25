package com.cdac.demo.model;

import javax.persistence.*;

@Entity
@Table(name="CDAC_CUSTOMER_HB")
public class Customer {
	
	@Id
	@Column(name="CUST_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custId;
	
	@Column(name="custName")
	private String custName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	public Customer() {
		
	}
	
	public Customer(int custId, String custName, String email, String phone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.email = email;
		this.phone = phone;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}
