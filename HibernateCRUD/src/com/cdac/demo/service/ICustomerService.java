package com.cdac.demo.service;

import java.util.List;

import com.cdac.demo.exception.CustomerException;
import com.cdac.demo.model.Customer;

public interface ICustomerService {

	public Customer addCustomer(Customer customer) throws CustomerException;
	public Customer getCustomerById(Integer custId) throws CustomerException;
	public Customer updateCustomer(Customer customer) throws CustomerException;
	public Customer deleteCustomer(Integer custIds) throws CustomerException;
	
	public List<Customer> listAllCustomer() throws CustomerException;
	
}


/*
 *
 * Object would be created from Factory and not directly.
 * 
 * *
 */