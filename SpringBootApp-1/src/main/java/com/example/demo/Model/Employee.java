package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String designation;
	private String employeeType;
	private String appointmentDate;
	
	
	private int depId;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String designation, String employeeType, String appointmentDate, int depId) {

		this.id = id;
		this.name = name;
		this.designation = designation;
		this.employeeType = employeeType;
		this.appointmentDate = appointmentDate;
		this.depId = depId;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	
	
	
}
