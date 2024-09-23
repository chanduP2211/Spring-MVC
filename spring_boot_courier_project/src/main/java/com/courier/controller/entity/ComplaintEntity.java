package com.courier.controller.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ComplaintEntity  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1504413655317859652L;
	@Id
	private String trackId;
	private String name;
	private String mobile;
	private String email;
	private String city;
	private String type;
	private String description;
	public ComplaintEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComplaintEntity(String trackId, String name, String mobile, String email, String type, String city,
			String description) {
		super();
		this.trackId = trackId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.type = type;
		this.city = city;
		this.description = description;
	}
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
