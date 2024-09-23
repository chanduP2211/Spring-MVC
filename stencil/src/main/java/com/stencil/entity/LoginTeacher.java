package com.stencil.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginTeacher {
     @Id
	 private String username;
	 private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginTeacher(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public LoginTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
}
