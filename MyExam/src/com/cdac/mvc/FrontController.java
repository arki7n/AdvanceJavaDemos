package com.cdac.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.mvc.model.Student;
import com.cdac.mvc.service.IStudentService;

@Controller
public class FrontController {

	@Autowired
	private IStudentService studentService;
	
	public FrontController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping("/")
	public ModelAndView getIndex() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/index")
	public ModelAndView getIndexPage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/listrecords")
	public String getRecords(Model model) {
		
		List<Student> students = this.studentService.listStudent();
		model.addAttribute("data", students);
		
		return "list";
	}
	
	@RequestMapping("/addpage")
	public String getAddPage(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		
		return "addpage";
	}
	
	
	// For add and update student both
	@RequestMapping(value = "/addrecord", method = RequestMethod.POST)
	public String addRecord(@ModelAttribute("student") 
	@Valid Student p, 
	BindingResult result, Model model) {
		
		System.out.println(result.hasErrors());
		
		if (result.hasErrors()) {
			return "addpage";
		}else {
			this.studentService.addStudent(p);  // new student, add it
			return "redirect:/listrecords";
		}
		


	}
	
	
	

	
	
	
	
	

//////////////////////////////////////////////
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
	
	
	
	
	
//yaha se apna new code.................., sabke return page same hai
	
		@RequestMapping("/students")
		public String showStudentList(Model model) {
			
			Student student = new Student();	//ye empty wala
			List<Student> studentList = studentService.listStudent();	//ye bhara hua wala
			
			
			//call the service to get the list of user
			model.addAttribute("student", student);	//ye new form ke lie
			model.addAttribute("studentList", studentList);	//ye listing ke lie
			
			return new String("studentPage");//viewName
		}
	
		@RequestMapping("/editStudent/{studentId}")
		public String showEditStudentPage(@PathVariable("studentId") int studentId, Model model) {
			
			System.out.println(studentId);
			
			Student studentObj = this.studentService.editStudentById(studentId);
			model.addAttribute("student", studentObj);
			
			//System.out.println("jjjjjjjjjjjjjjjjjjj"+studentObj);
			
			
			
			List<Student> studentListObj = this.studentService.listStudent();
			model.addAttribute("listStudents", studentListObj);
			
			return "studentPage";// view name
		
		}
		
		
		//-----------------------
	
		// For add and update student both
		@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
		public String addStudent(@ModelAttribute("student") @Valid Student p, BindingResult result, Model model) {
			
			if (!result.hasErrors()) {
				if (p.getId() == null) {
					this.studentService.addStudent(p);  // new student, add it
				} else {
					this.studentService.updateStudent(p); // existing student, call update
				}
				return "redirect:/students";
			}
			
			//model.addAttribute("listStudents",this.studentService.listStudent());
			//return "studentPage";
			return "redirect:/students";

		}

		@RequestMapping("/removeStudent/{studentId}")
		public String removeStudent(@PathVariable("studentId") int studentId) {		
			
			this.studentService.deleteStudentById(studentId);
			return "redirect:/students";
		}
		//when we want to send request from one method of controller
		//to another method of controller
		//use redirect:/requestMappingPath

		

	
	

}
