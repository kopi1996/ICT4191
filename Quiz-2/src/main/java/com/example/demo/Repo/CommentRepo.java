package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Comment;


@Repository
public interface CommentRepo extends JpaRepository<Comment,Long> {

}
