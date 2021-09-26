package com.example.demo.Controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Comment;
import com.example.demo.Repo.CommentRepo;


@RestController
@RequestMapping("/comment")
@Produces(MediaType.APPLICATION_XML)
public class CommentController {
	@Autowired
	private CommentRepo repo;
	
	@GetMapping
	public List<Comment> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Comment get(@PathVariable("id") long id){
		return repo.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Comment comment)
	{
		repo.save(comment);
	}
	
	@PutMapping
	public void update(@RequestBody Comment comment)
	{
		repo.save(comment);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id){
		repo.deleteById(id);
	}
}
