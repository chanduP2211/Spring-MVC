package com.stencil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Section {
     
	@Id
	private String section;
	private String id;
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
