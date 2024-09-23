package com.courier.controller.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LocationEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7943818482653185398L;
	@Id
	private String id;
	private String fromCity;
	private String toCity;
	private String weight;
	private String distance;
	
	public LocationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocationEntity(String id, String fromCity, String toCity, String weight, String distance) {
		super();
		this.id = id;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.weight = weight;
		this.distance = distance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
