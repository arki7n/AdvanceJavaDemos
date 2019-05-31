package com.cdac.mvc.service;

import java.util.List;

import com.cdac.mvc.model.Student;

public interface IStudentService {
	
	public Student addStudent(Student student);
	public List<Student> listStudent();
	public Student editStudentById(Integer studentId);
	public Student updateStudent(Student student);
	public Student deleteStudentById(Integer studentId);

}
