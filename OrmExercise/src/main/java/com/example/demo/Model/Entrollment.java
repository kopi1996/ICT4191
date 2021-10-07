package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Entrollment {
	@Id
	private String entrollmentid;
	private String grade;
	@ManyToOne
	@JoinColumn(name="StudentId",referencedColumnName = "id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="CourseId",referencedColumnName = "courseid")
	private Course course;

	public Entrollment(String entrollmentid, String grade, Student student, Course course) {
		super();
		this.entrollmentid = entrollmentid;
		this.grade = grade;
		this.student = student;
		this.course = course;
	}

	public Entrollment() {
		super();
	}

	public String getEntrollmentid() {
		return entrollmentid;
	}

	public void setEntrollmentid(String entrollmentid) {
		this.entrollmentid = entrollmentid;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
}
