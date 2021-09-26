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



import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.example.demo.Model.Comment;
import com.example.demo.Model.Post;
import com.example.demo.Model.User;
import com.example.demo.Repo.UserRepo;

@RestController
@RequestMapping("/user")
@Produces(MediaType.APPLICATION_XML)
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping
	public List<User> getAll(){
		List<User> users=repo.findAll();
		for(User u : users)
		{
			String selfUrl=linkTo(UserController.class).slash(u.getUserId()).toString();
			String postUrl=linkTo(UserController.class).slash(u.getUserId()).slash("post").toString();
			String commentUrl=linkTo(UserController.class).slash(u.getUserId()).slash("comment").toString();
			
			u.addLink(selfUrl, "self");
			u.addLink(postUrl, "post");
			u.addLink(commentUrl, "comment");
		}
		return users;
	}
	
	@GetMapping("/{id}")
	public User get(@PathVariable("id") String id){
		return repo.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody User user)
	{
		repo.save(user);
	}
	
	@PutMapping
	public void update(@RequestBody User user)
	{
		repo.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id){
		repo.deleteById(id);
	}
	
	@GetMapping("/{id}/post")
	public List<Post> getPost(@PathVariable("id") String id){
		return repo.findById(id).get().getPosts();
	}
	@GetMapping("/{id}/comment")
	public List<Comment> getComment(@PathVariable("id") String id){
		return repo.findById(id).get().getComments();
	}
}
