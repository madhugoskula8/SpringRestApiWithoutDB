package com.example.demo.model;

import java.util.Date;

public class User {

	
	private int id;
	private String name;
	private Date timeStamp;
	
	
	public User() {
		super();
	}
	public User(int id, String name, Date timeStamp) {
		super();
		this.id = id;
		this.name = name;
		this.timeStamp = timeStamp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", timeStamp=" + timeStamp + "]";
	}
	
	
}
