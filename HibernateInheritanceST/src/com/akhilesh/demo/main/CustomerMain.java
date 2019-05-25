package com.akhilesh.demo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.akhilesh.demo.models.*;

public class CustomerMain {

	//prepWork 1 : declare obj of service interface
	
	//prepWork 2 : create obj of service class
	//static keyword : Single copy per class
	

	
	public static void main(String[] args) {
		
		
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session  = sf.openSession();
		
		
		System.out.println("\n**************Adding customer record ********");
		Person person = new Person(111,"Akhilesh", "Yadav");
		
		
		Customer customer = new Customer(111,"Sunil", "Yadav");
		customer.setMobileNo("978746464");
		
		OnlineCustomer onlineCustomer = new OnlineCustomer(111,"Amit", "Yadav");
		onlineCustomer.setMobileNo("64611646456");
		onlineCustomer.setEmail("akhilesh@gmail.com");
		
		 
		session.beginTransaction();
		session.save(person); //Saving the first Country object object
		session.save(customer); //Saving the first AsianCountry object
		session.save(onlineCustomer); //Saving the first EuropeanCountry object
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
		

	}

}
