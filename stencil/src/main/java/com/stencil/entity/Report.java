package com.stencil.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Report {
	  @Id
	  @Column(name = "id")
      private String rollNo;
	  private String name;
	  private String section;
	  private String subject;
	  private int present;
      private int absent;
   	  private String attend;
	  public Report(String rollNo, String name, String section, String subject, int present, int absent, String attend) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.section = section;
		this.subject = subject;
		this.present = present;
		this.absent = absent;
		this.attend = attend;
	}
	public String getAttend() {
		return attend;
	}
	public void setAttend(String attend) {
		this.attend = attend;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getPresent() {
		return present;
	}
	public void setPresent(int present) {
		this.present = present;
	}
	public int getAbsent() {
		return absent;
	}
	public void setAbsent(int absent) {
		this.absent = absent;
	}

	
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
}
