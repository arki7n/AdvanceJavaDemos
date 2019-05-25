package com.cdac.demo.dao;

import java.util.List;

import org.hibernate.Transaction;

import com.cdac.demo.exception.CustomerException;
import com.cdac.demo.model.Customer;

public interface ICustomerDao {
	
	public Customer addCustomer(Customer customer) throws CustomerException;
	public Customer getCustomerById(Integer custId) throws CustomerException;
	public Customer updateCustomer(Customer customer) throws CustomerException;
	public Customer deleteCustomer(Integer custId) throws CustomerException;
	
	public List<Customer> listAllCustomer() throws CustomerException;
	
	public Transaction beginTx() throws CustomerException;
	public void commitTx() throws CustomerException;
	
	
}
