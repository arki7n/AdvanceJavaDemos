package com.cdac.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.mvc.model.Student;

@Controller
public class FrontController {

	public FrontController() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@RequestMapping("/")
	public ModelAndView getIndex() {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("/list_records")
	public String getList(Model model) {
		
		Student student = new Student(1, "Akhilesh", "Mumbai", 99);
		
		
		List<Student> students = new ArrayList<Student>();
		
		Student student1 = new Student(2, "Shikha", "Mumbai", 100);
		Student student2 = new Student(3, "Amit", "Los Angeles", 80);
		
		students.add(student);
		students.add(student1);
		students.add(student2);
		
		model.addAttribute("data", students);
		
		
		return "list";
	}
	
	

}
