package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Department {
	
	@Id
	
	private int id;
	private String name;
	private String faculty;
	private int noOfStaff;
	
	
	public Department() {
		
	}
	
	public Department(int id, String name, String faculty, int noOfStaff) {

		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.noOfStaff = noOfStaff;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	
	
	
	
	
}
