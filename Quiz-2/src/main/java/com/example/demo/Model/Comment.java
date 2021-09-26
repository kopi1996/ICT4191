package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Comment {
	@Id
	private long CommentId;
	private String Comment;
	@Column(columnDefinition="datetime")
	private String CommentedOn;
	@ManyToOne
	@JoinColumn(name="commentedin",referencedColumnName="PostId")
	private Post CommentedIn;
	
	@ManyToOne
	@JoinColumn(name="commentedby",referencedColumnName="UserId")
	private User CommentedBy;
	
	
	
	
	public Comment() {
		
	}



	public Comment(long commentId, String comment, String commentedOn, Post commentedIn, User commentedBy) {
		super();
		CommentId = commentId;
		Comment = comment;
		CommentedOn = commentedOn;
		CommentedIn = commentedIn;
		CommentedBy = commentedBy;
	}



	public long getCommentId() {
		return CommentId;
	}



	public void setCommentId(long commentId) {
		CommentId = commentId;
	}



	public String getComment() {
		return Comment;
	}



	public void setComment(String comment) {
		Comment = comment;
	}



	public String getCommentedOn() {
		return CommentedOn;
	}



	public void setCommentedOn(String commentedOn) {
		CommentedOn = commentedOn;
	}



	public Post getCommentedIn() {
		return CommentedIn;
	}



	public void setCommentedIn(Post commentedIn) {
		CommentedIn = commentedIn;
	}



	public User getCommentedBy() {
		return CommentedBy;
	}



	public void setCommentedBy(User commentedBy) {
		CommentedBy = commentedBy;
	}



	
	
	
}
