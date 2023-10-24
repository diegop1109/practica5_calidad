package com.CMEPPS.listatareas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todos")
public class Todo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String username;
	private String description;
	private Date TargetDate;
	
	
	public Todo(String user, String desc, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.username = user;
		this.description = desc;
		TargetDate = targetDate;
	}


	public Todo() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getTargetDate() {
		return TargetDate;
	}


	public void setTargetDate(Date targetDate) {
		TargetDate = targetDate;
	}
	
}
