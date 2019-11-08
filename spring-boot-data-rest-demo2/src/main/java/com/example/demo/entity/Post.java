package com.example.demo.entity;



import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "post")
public class Post {
	@Id
	@Column(name = "post_id")
	private long postId;
	@Column(name = "post_name")
	private String postName;

//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	@Column(name = "post_date")
	//@Temporal(TemporalType.DATE)
	private Date postDate ;
	//dtf.format(LocalDateTime.now());

	@OneToMany(targetEntity = Comment.class)
	private List<Comment> comment;
}
