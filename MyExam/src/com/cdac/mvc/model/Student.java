package com.cdac.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String city;
	
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
