package com.gopi.AirportDatabase.Controller;

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

import com.gopi.AirportDatabase.Model.Company;
import com.gopi.AirportDatabase.Repo.CompanyRepo;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyRepo repo;
	
	@GetMapping
	public List<Company> getAll()
	{
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Company get(@PathVariable("id") int id)
	{
		return repo.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Company com)
	{
		repo.save(com);
		
	}
	@PutMapping
	public void update(@RequestBody Company com)
	{
		repo.save(com);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id)
	{
		repo.deleteById(id);
	}
	


}
