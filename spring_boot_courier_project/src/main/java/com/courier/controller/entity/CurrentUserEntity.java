package com.courier.controller.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrentUserEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1906516083785019484L;
	@Id
	private String email;
	private String password;
	
	public CurrentUserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentUserEntity(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
