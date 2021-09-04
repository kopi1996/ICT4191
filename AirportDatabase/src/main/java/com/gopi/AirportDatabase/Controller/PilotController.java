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
import com.gopi.AirportDatabase.Model.Pilot;
import com.gopi.AirportDatabase.Repo.AeroplaneRepo;
import com.gopi.AirportDatabase.Repo.PilotRepo;

@RestController
@RequestMapping("/pilot")
public class PilotController {
	@Autowired
	private PilotRepo repo;
	
	@GetMapping
	public List<Pilot> getAll()
	{
		return repo.findAll();
	}
	@GetMapping("/{id}")
	public Pilot get(@PathVariable("id") int id)
	{
		return repo.findById(id).get();
	}
	@PostMapping
	public void add(@RequestBody Pilot pilot)
	{
		repo.save(pilot);
		
	}
	@PutMapping
	public void update(@RequestBody Pilot pilot)
	{
		repo.save(pilot);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id)
	{
		repo.deleteById(id);
	}
	
}
