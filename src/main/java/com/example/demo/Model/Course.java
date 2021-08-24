package com.example.demo.Model;

public class Course extends PrimaryId<String> {
	private String name;
	private int duration;
	
	
	
	public Course(String id, String name, int duration) {
		super(id);
		this.name = name;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
