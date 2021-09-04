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

import com.gopi.AirportDatabase.Model.Aeroplane;
import com.gopi.AirportDatabase.Model.Company;
import com.gopi.AirportDatabase.Repo.AeroplaneRepo;
import com.gopi.AirportDatabase.Repo.CompanyRepo;

@RestController
@RequestMapping("/aeroplane")
public class AeroplaneController {
	@Autowired
	private AeroplaneRepo repo;
	
	@GetMapping
	public List<Aeroplane> getAll()
	{
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Aeroplane get(@PathVariable("id") int id)
	{
		return repo.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Aeroplane aer)
	{
		repo.save(aer);
		
	}
	@PutMapping
	public void update(@RequestBody Aeroplane aer)
	{
		repo.save(aer);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id)
	{
		repo.deleteById(id);
	}
	

}
