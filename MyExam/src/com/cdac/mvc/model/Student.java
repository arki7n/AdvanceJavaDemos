package com.cdac.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(max = 20, min = 3, 
			message = " Name entered is invalid. It must be between 3 and 20 characters.")
	@NotEmpty(message = "cannot be empty!")
	private String name;
	
	@Size(max = 20, min = 3, 
			message = " Name entered is invalid. It must be between 3 and 20 characters.")
	@NotEmpty(message = "cannot be empty!")
	private String city;
	
	

	@NotNull
	@Min(18)
	@Max(100)
	private Integer score;
	
	
	
	public Student() {
		
	}
	

	public Student(Integer id, String name, String city, Integer score) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.score = score;
	}
	

	public Student(String name, String city, Integer score) {
		super();
		this.name = name;
		this.city = city;
		this.score = score;
	}


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public Integer getScore() {
		return score;
	}



	public void setScore(Integer score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", score=" + score + "]";
	}


	

}
