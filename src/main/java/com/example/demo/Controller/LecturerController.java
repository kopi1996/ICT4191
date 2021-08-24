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

import com.example.demo.Model.Lecturer;

import com.example.demo.repo.Repo;

@RestController
@RequestMapping("/lecture")
public class LecturerController {
	
	
	private Repo<Long,Lecturer> repo=new Repo<Long,Lecturer>();
	
	@GetMapping
	public Collection<Lecturer> getAll()
	{
		
		return repo.getAll();
	}
	
	@GetMapping("/{id}")
	public Lecturer get(@PathVariable("id") long id)
	{
		
		return repo.get(id);
	}
	@PostMapping
	public void add(@RequestBody Lecturer data) {
		repo.add(data);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id)
	{
		repo.delete(id);
	}
	@PutMapping("/{id}")
	public void update(@PathVariable("id") long id,@RequestBody Lecturer st)
	{
		repo.update(id,st);
	}
	
}
