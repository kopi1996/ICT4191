package com.example.demo.Controller;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.repo.Repo;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	private Repo<String,Student> repo=new Repo<String,Student>();
	
	@GetMapping
	public Collection<Student> getAll()
	{
		
		return repo.getAll();
	}
	
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") String id)
	{
		
		return repo.get(id);
	}
	@PostMapping
	public void add(@RequestBody Student student) {
		repo.add(student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		repo.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Student st)
	{
		repo.update(id,st);
	}
	
}
