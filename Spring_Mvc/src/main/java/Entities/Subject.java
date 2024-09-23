package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
    @Id
	private String subject;
	private String teacher;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
