package com.akhilesh.demo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.akhilesh.demo.models.*;

public class CustomerMain {


	public static void main(String[] args) {
		
		
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session  = sf.openSession();
		
		
		System.out.println("\n**************Adding customer record ********");
		Person person = new Person("Akhilesh", "Yadav");
		
		
		Customer customer = new Customer("Sunil", "Yadav");
		customer.setId(121);
		customer.setMobileNo("978746464");
		
		OnlineCustomer onlineCustomer = new OnlineCustomer("Amit", "Yadav");
		onlineCustomer.setId(123);
		onlineCustomer.setMobileNo("64611646456");
		onlineCustomer.setEmail("akhilesh@gmail.com");
		
		
		/*
		Country country1 = new Country();
		country1.setName("Asian Country");
		
		AsianCountry asianCountry1 = new AsianCountry();
		asianCountry1.setName("Japan");
		asianCountry1.setContinent("Asia");
		asianCountry1.setPopulation(127000000);
	    
	    
		EuropeanCountry europeanCountry1 = new EuropeanCountry();
		europeanCountry1.setName("Germany");
		europeanCountry1.setContinent("Europe");
		europeanCountry1.setPopulation(87000000);
	*/    
	    
		session.beginTransaction();
		session.save(person); //Saving the first Country object object
		session.save(customer); //Saving the first AsianCountry object
		session.save(onlineCustomer); //Saving the first EuropeanCountry object
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
		
		
		/*
		try {
			customerService.addCustomer(customer);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("\n**************Adding customer record ********");
		Customer customer2 = new Customer(111,"Akhilesh", "Yadav");
		customer2.setMobileNo("978746464");
		try {
			customerService.addCustomer(customer2);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		

		
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
		
		*/

	}

}
