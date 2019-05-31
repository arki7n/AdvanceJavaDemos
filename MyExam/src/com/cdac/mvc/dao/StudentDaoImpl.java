package com.cdac.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.mvc.model.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		
		return this.getSessionFactory();
	}
	
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		
		System.out.println("SessionFactory"+sessionFactory);
		this.sessionFactory=sessionFactory;
	}

	
	@Override
	@Transactional
	public Student addStudent(Student student) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(student);
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	@Transactional
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<Student> student = session.createQuery("from Student").list();
		return student;
	}

	@Override
	@Transactional
	public Student editStudentById(Integer studentId) {
		Session session = this.sessionFactory.getCurrentSession();
		Student p = (Student) session.load(Student.class,new Integer(studentId));
		// TODO Auto-generated method stub
		
		System.out.println(p);
		return p;
	}

	@Override
	@Transactional
	public Student updateStudent(Student student) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(student);
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	@Transactional
	public Student deleteStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		 Student std = (Student) session.load(Student.class,new Integer(studentId));
		 if(std!=null)
			 session.delete(std);
		return std;
	}

}
