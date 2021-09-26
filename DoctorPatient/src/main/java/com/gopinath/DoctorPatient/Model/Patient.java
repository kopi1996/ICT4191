package com.gopinath.DoctorPatient.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Patient {
@Id
private String patientid;
private String name;
private int age;
@ManyToMany(mappedBy = "patients")
private List<Doctor>doctors=new ArrayList<Doctor>();
public Patient(String patientid, String name, int age, List<Doctor> doctors) {
	super();
	this.patientid = patientid;
	this.name = name;
	this.age = age;
	this.doctors = doctors;
}
public Patient() {
	super();
}
public String getPatientid() {
	return patientid;
}
public void setPatientid(String patientid) {
	this.patientid = patientid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@JsonIgnore
public List<Doctor> getDoctors() {
	return doctors;
}
public void setDoctors(List<Doctor> doctors) {
	this.doctors = doctors;
}


}
