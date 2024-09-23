package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {

	@Id
	private String id;
	private String fname;
	private String lname;
	private String gender;
	private String dob;
	private Long phone;
	private String section;
	private String address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(String id, String fname, String lname, String gender, String dob, Long phone, String section,
			String address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
		this.phone = phone;
		this.section = section;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
