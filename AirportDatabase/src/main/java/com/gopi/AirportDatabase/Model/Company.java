package com.gopi.AirportDatabase.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@Id
	private int companyid;
	private String name;
	@OneToMany(mappedBy = "company")
	private List<Aeroplane> aeroplanes;
	@OneToMany(mappedBy = "company")
	private List<Pilot> pilots;
	public Company(int companyid, String name, List<Aeroplane> aeroplanes, List<Pilot> pilots) {
		super();
		this.companyid = companyid;
		this.name = name;
		this.aeroplanes = aeroplanes;
		this.pilots = pilots;
	}
	public Company() {
		
	}
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Aeroplane> getAeroplanes() {
		return aeroplanes;
	}
	public void setAeroplanes(List<Aeroplane> aeroplanes) {
		this.aeroplanes = aeroplanes;
	}
	public List<Pilot> getPilots() {
		return pilots;
	}
	public void setPilots(List<Pilot> pilots) {
		this.pilots = pilots;
	}
	
	
	
	
}
