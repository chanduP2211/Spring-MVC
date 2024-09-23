package com.courier.controller.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class StaffEntity  implements Serializable  {

/**
	 * 
	 */
	private static final long serialVersionUID = 3527655928231046819L;
@Id
private String email;
private String firstName;
private String lastName;
private String mobile;
private String address;
private String branch;
public StaffEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public StaffEntity(String email, String firstName, String lastName, String mobile, String address, String branch) {
	super();
	this.email = email;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobile = mobile;
	this.address = address;
	this.branch = branch;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}

	





}
