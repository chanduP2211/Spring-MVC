package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
      private int id;
	  private String rollNo;
	  private String name;
	  private String section;
	  private String subject;
	  private String date;
	  private String attendance;
	  
	  public Attendance(int id, String rollNo, String name, String section, String subject, String attendance,
			String date) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.section = section;
		this.subject = subject;
		this.attendance = attendance;
		this.date = date;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	  
	  
	
}
