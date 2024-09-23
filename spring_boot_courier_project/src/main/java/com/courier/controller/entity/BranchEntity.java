package com.courier.controller.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BranchEntity implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7442426477917240543L;
	@Id
	private String branchCode;
	private String mobile;
	private String state;
	private String   country;
	private String  address;
	private String city;
	
	
	public BranchEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BranchEntity(String branchCode, String mobile, String state, String country, String address, String city) {
		super();
		this.branchCode = branchCode;
		this.mobile = mobile;
		this.state = state;
		this.country = country;
		this.address = address;
		this.city = city;
	}


	public String getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	
	


		   

}
