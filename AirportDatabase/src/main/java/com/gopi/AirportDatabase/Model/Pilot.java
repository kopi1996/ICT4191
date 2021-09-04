package com.gopi.AirportDatabase.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pilot {
	@Id
	private int pilotid;
	private String name;
	private double salary;
	@ManyToOne
	@JoinColumn(name = "com_id",referencedColumnName = "companyid")
	private Company company;
	public Pilot(int pilotid, String name, double salary, Company company) {
		super();
		this.pilotid = pilotid;
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	public Pilot() {
		super();
	}
	public int getPilotid() {
		return pilotid;
	}
	public void setPilotid(int pilotid) {
		this.pilotid = pilotid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
	
}
