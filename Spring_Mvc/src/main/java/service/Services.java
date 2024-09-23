package service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entities.Admin;
import Entities.Attendance;
import Entities.Login;
import Entities.LoginStudent;
import Entities.LoginTeacher;
import Entities.Report;
import Entities.Student;
import Entities.Subject;
import Entities.Teacher;
import dao.Dao;
@Service
public class Services {
	
@Autowired
private Dao dao;




public void insertAdmin(Admin admin)  {
    this.dao.insertAdmin(admin);
}
public Boolean insertTeacher( Teacher teacher) {
    this.dao.insertTeacher(teacher);
    return true;
}
public Boolean insertSubject(Subject subject) {
	Boolean result = false;
    if(this.dao.insertSubject(subject))
    	result = true;
    return result;
}

public Boolean insertStudent( Student student){
    this.dao.insertStudent(student);
    return true;
}
public Boolean insertSection(Report report){
	Boolean result = false;
    if(this.dao.insertSection(report))
    	result = true;
    return result;
}
public Boolean addAttendance(Attendance attend){
    this.dao.addAttendance(attend);
    return true;
}
public boolean addClass( Attendance attend) {
	this.dao.addClass(attend);
	return true;
}
public Boolean addLogin(Login log){
    this.dao.addLogin(log);
    return true;
}
public Boolean loginTeacher(LoginTeacher login){
    this.dao.loginTeacher(login);
    return true;
}

public Boolean loginStudent(LoginStudent login){
    this.dao.loginStudent(login);
    return true;
}

















public Boolean updateSection(Report report){
	Boolean result = false;
    if(this.dao.updateSection(report))
    	result = true;
    return result;
}








public List<Admin> getAdmin() {
	List<Admin> list = this.dao.getAdmin();
    return list; 
}
public List<Report> getSection() {
	List<Report> list = this.dao.getClasses();
    return list; 
}
public List<Subject> getSubject() {
	List<Subject> list = this.dao.getSubjects();
    return list; 
}
public List<Student> getStudent() {
	List<Student> list = this.dao.getStudents();
    return list; 
}
public List<Teacher> getTeacher() {
	List<Teacher> list = this.dao.getTeachers();
    return list; 
}
public List<Attendance> getClasses() {
	List<Attendance> list = this.dao.getClases();
    return list; 
}
public List<LoginTeacher> getLogin() {
	List<LoginTeacher> list = this.dao.getLogin();
    return list; 
}
public List<LoginStudent> getLog() {
	List<LoginStudent> list = this.dao.getLog();
    return list; 
}
public List<Login> Login() {
	List<Login> list = this.dao.Login();
    return list; 
}








public boolean deleteStudent(String id) {	
    return this.dao.deleteStudent(id);
}
public boolean deleteSubject( String id) {	
    return this.dao.deleteSubject(id);
}
public boolean deleteTeacher(String id) {
    return this.dao.deleteTeacher(id);
}
public boolean deleteLoginStudent(String id) {
	
    return this.dao.deleteLoginStudent(id);
}
public boolean deleteLoginTeacher(String id) {
    return this.dao.deleteLoginTeacher(id);
}




}
