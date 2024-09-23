package com.courier.controller.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2757228920970553093L;
	@Id
	private String email;
	private String name;
	private String mobileNumber;
	private String password;
	private String confirmPassword;
	
	
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(String name, String email, String mobileNumber, String password, String confirmPassword) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	
	
	
	
	
	

}
