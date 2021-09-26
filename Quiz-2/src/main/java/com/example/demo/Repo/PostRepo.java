package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Post;

@Repository
public interface PostRepo extends JpaRepository<Post,Long> {

}
