package com.cdac.demo.dao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.cdac.demo.exception.CustomerException;
import com.cdac.demo.model.Customer;

public class CustomerDao implements ICustomerDao {
	
	private SessionFactory sessionFactory;
	private Session session;
	
	private Transaction transaction;
	private Query query;
	
	
	/* Prepwork - 1
	 * SessionFactory
	 * Session
	 * Transaction
	 * Query
	 * 
	 * 
	 * Prepwork - 2
	 * Configure and build sessionFactory object in constructor
	 * 
	 * Prepwork - 3
	 * get Session object from factory in constructor
	 * 
	 * */

	public CustomerDao() {
		// TODO Auto-generated constructor stub
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
	}

	@Override
	public Customer addCustomer(Customer customer) throws CustomerException {
		// DML - so begin txn before save() method and commit txn after saving.
		
		//transaction = session.beginTransaction();
		
		session.save(customer);
		return customer;
	}

	@Override
	public Customer getCustomerById(Integer custId) throws CustomerException {
		return (Customer)session.get(Customer.class, custId);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		
		System.out.println("Need to update customer "+ customer);
		
		session.update(customer);
		return customer;
	}

	@Override
	public Customer deleteCustomer(Integer custId) throws CustomerException {

		Customer customer = getCustomerById(custId);
		if(customer!=null)
			session.delete(customer);
		else
			customer = null;
		
		return customer;
	}

	@Override
	public List<Customer> listAllCustomer() throws CustomerException {
		
		return session.createQuery("from Customer").list();

	}

	//transaction will come into action at service layer
	@Override
	public Transaction beginTx() throws CustomerException {
		transaction = session.beginTransaction();
		return transaction;
	}

	@Override
	public void commitTx() throws CustomerException {
		transaction.commit();
	}

}
