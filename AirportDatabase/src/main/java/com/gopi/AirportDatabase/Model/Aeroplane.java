package com.gopi.AirportDatabase.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aeroplane {
	@Id
	private int aeroplaneid;
	private String type;
	private String color;
	@ManyToOne
	@JoinColumn(name="comp_id",referencedColumnName = "companyid")
	private Company company;
	public Aeroplane(int aeroplaneid, String type, String color, Company company) {
		super();
		this.aeroplaneid = aeroplaneid;
		this.type = type;
		this.color = color;
		this.company = company;
	}
	public Aeroplane() {
		super();
	}
	public int getAeroplaneid() {
		return aeroplaneid;
	}
	public void setAeroplaneid(int aeroplaneid) {
		this.aeroplaneid = aeroplaneid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
	
}
