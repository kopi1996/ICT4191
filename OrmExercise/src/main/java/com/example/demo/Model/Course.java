package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	private String courseid;
	private String title;
	private int credits;
	@OneToMany(mappedBy = "course")
	private List<Entrollment> entrollments;
	
	@ManyToOne
	@JoinColumn(name="DepartmentId",referencedColumnName = "departmentId")
	private Department department;
	
	@ManyToMany(mappedBy = "courses")
	private List<Instructor> instructors;

	public Course(String courseid, String title, int credits, List<Entrollment> entrollments, Department department,
			List<Instructor> instructors) {
		super();
		this.courseid = courseid;
		this.title = title;
		this.credits = credits;
		this.entrollments = entrollments;
		this.department = department;
		this.instructors = instructors;
	}

	public Course() {
		super();
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public List<Entrollment> getEntrollments() {
		return entrollments;
	}

	public void setEntrollments(List<Entrollment> entrollments) {
		this.entrollments = entrollments;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<Instructor> instructors) {
		this.instructors = instructors;
	}
	
	
}
