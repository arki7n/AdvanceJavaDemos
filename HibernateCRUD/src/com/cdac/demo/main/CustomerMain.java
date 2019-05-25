package com.cdac.demo.main;

import java.util.List;

import com.cdac.demo.exception.CustomerException;
import com.cdac.demo.model.Customer;
import com.cdac.demo.service.CustomerService;
import com.cdac.demo.service.ICustomerService;

public class CustomerMain {

	//prepWork 1 : declare obj of service interface
	
	private  static ICustomerService customerService;
	
	//prepWork 2 : create obj of service class
	//static keyword : Single copy per class
	
	static {
		customerService = new CustomerService();
	}
	
	public static void main(String[] args) {

		System.out.println("\n**************Adding customer record ********");
		Customer customer = new Customer(111,"Akhilesh", "amit@gmail.com", "8798465446");
		try {
			customerService.addCustomer(customer);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("\n**************Retrieving customer record ********");
		try {
			customer = customerService.getCustomerById(customer.getCustId());
			System.out.println("Getting Customer : "+customer);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("\n**************Updating customer record ********");
		try {
			customerService.updateCustomer(customer);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n**************Listing customer record ********");
		try {
			List<Customer> ls = customerService.listAllCustomer();
			ls.forEach((cs)->System.out.println("List record "+cs));
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("\n**************Deleting customer record ********");
		try {
			customerService.deleteCustomer(customer.getCustId());
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
