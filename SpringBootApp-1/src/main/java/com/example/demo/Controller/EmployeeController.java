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

import com.example.demo.Model.Employee;
import com.example.demo.Repo.EmployeeRepo;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepo repo;
	
	@GetMapping
	public List<Employee> getAll(){
		return repo.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Employee get(@PathVariable("id") int id){
		return repo.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Employee emp)
	{
		repo.save(emp);
	}
	
	@PutMapping
	public void update(@RequestBody Employee emp)
	{
		repo.save(emp);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id){
		repo.deleteById(id);
	}
}
