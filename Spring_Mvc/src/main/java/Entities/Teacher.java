package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Teacher {

	@Id
	private String id;
	private String email;
	private String name;
	private String gender;
	private Long phone;
	private String degree;
	private String experience;
	private String address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Teacher(String id, String name, String email, String gender, Long phone, String degree, String experience,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
		this.degree = degree;
		this.experience = experience;
		this.address = address;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
