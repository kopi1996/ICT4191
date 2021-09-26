package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Department;
import com.example.demo.Repo.DepartmentRepo;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	
	@Autowired
	private DepartmentRepo repo;
	
	@GetMapping
	public List<Department> getAll(){
		return repo.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Department get(@PathVariable("id") int id){
		return repo.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Department dep)
	{
		repo.save(dep);
	}
	
	@PutMapping
	public void update(@RequestBody Department dep)
	{
		repo.save(dep);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id){
		repo.deleteById(id);
	}
}
