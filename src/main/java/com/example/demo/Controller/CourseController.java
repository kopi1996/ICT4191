package com.example.demo.Controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Course;
import com.example.demo.repo.Repo;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	private Repo<String,Course> repo=new Repo<String,Course>();
	
	@GetMapping
	public Collection<Course> getAll()
	{
		
		return repo.getAll();
	}
	
	@GetMapping("/{id}")
	public Course get(@PathVariable("id") String id)
	{
		
		return repo.get(id);
	}
	@PostMapping
	public void add(@RequestBody Course data) {
		repo.add(data);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		repo.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Course st)
	{
		repo.update(id,st);
	}
}
