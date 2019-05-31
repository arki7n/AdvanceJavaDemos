package com.cdac.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.mvc.dao.IStudentDao;
import com.cdac.mvc.model.Student;

@Service
public class StudentServiceImpl implements IStudentService {
	
	
	@Autowired
	private IStudentDao studentDao;
	
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Student addStudent(Student student) {
		
		return studentDao.addStudent(student);
	}

	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		return studentDao.listStudent();
	}

	@Override
	public Student editStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return studentDao.editStudentById(studentId);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

	@Override
	public Student deleteStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudentById(studentId);
	}

}
