package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginStudent {

  @Id
  private String username;
  private String password;

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public LoginStudent(String password, String username) {
	super();
	this.password = password;
	this.username = username;
}
public LoginStudent() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
