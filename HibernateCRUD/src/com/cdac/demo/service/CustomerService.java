package com.cdac.demo.service;

import java.util.List;

import com.cdac.demo.dao.CustomerDao;
import com.cdac.demo.dao.ICustomerDao;
import com.cdac.demo.exception.CustomerException;
import com.cdac.demo.model.Customer;

public class CustomerService implements ICustomerService {

	/*
	 * prepWork 1 : Declare ICustomerDao Object
	 * 
	 * 
	 * */
	private ICustomerDao customerDao;
	
	
	
	//prepWork 2 : Create object of customerDao in the constructor
	public CustomerService() {
		customerDao = new CustomerDao();
	}

	@Override
	public Customer addCustomer(Customer customer) throws CustomerException {
		customerDao.beginTx();
		Customer cust = customerDao.addCustomer(customer);
		customerDao.commitTx();
		
		return cust;
	}

	@Override
	public Customer getCustomerById(Integer custId) throws CustomerException {
		
		//customerDao.beginTx();
		Customer cust = customerDao.getCustomerById(custId);
		//customerDao.commitTx();
		
		return cust;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		
		customerDao.beginTx();
		Customer cust = customerDao.updateCustomer(customer);
		customerDao.commitTx();
		
		return cust;
	}

	@Override
	public Customer deleteCustomer(Integer custId) throws CustomerException {
		
		customerDao.beginTx();
		Customer cust = customerDao.deleteCustomer(custId);
		customerDao.commitTx();
		
		return cust;
	}

	@Override
	public List<Customer> listAllCustomer() throws CustomerException {

		//customerDao.beginTx();
		List<Customer> ls = customerDao.listAllCustomer();
		//customerDao.commitTx();
		
		return ls;
	}

}
