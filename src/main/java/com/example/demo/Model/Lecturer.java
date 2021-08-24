package com.example.demo.Model;

public class Lecturer extends PrimaryId<Long> {
	private String name;
	private String department;
	
	
	
	public Lecturer(Long id, String name, String department) {
		super(id);
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
