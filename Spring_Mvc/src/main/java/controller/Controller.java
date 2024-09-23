package controller;




import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import Entities.Admin;
import Entities.Attendance;
import Entities.LoginStudent;
import Entities.LoginTeacher;
import Entities.Report;
import Entities.Student;
import Entities.Subject;
import Entities.Teacher;
import service.Services;
import Entities.Login; 





@RestController
@CrossOrigin(origins="http://127.0.0.1:5501")
public class Controller {
	
	
@Autowired
private Services service;




//@RequestMapping(path="/addAdmin",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
@RequestMapping(path="/addAdmin")
public String insertAdmin(@RequestBody Admin admin)  throws Exception   {
//    this.service.insertAdmin(admin);
	return "add";
}

@RequestMapping(path="/addTeacher",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
public Boolean insertTeacher(@RequestBody Teacher teacher)  throws Exception   {
    this.service.insertTeacher(teacher);
    return true;
}
@RequestMapping(path="/addSubject",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
public Boolean insertSubject(@RequestBody Subject subject)  throws Exception   {
	Boolean result = false;
    if(this.service.insertSubject(subject))
    	result = true;  
    return result;
}
@RequestMapping(path="/addStudent",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
public Boolean insertStudent(@RequestBody Student student)  throws Exception   {
    this.service.insertStudent(student);
    return true;
}
@RequestMapping(path="/addSection",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
public Boolean insertSection(@RequestBody Report report)  throws Exception   {
	Boolean result = false;
    if(this.service.insertSection(report))
    	result = true;
    return result;
}
@RequestMapping(path="/addAttendance",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
public Boolean addAttendance(@RequestBody Attendance attend)  throws Exception   {
    this.service.addAttendance(attend);
    return true;
}
@RequestMapping(path="/addClass",method = RequestMethod.POST)
public boolean addClass(@RequestBody Attendance attend) {
	this.service.addClass(attend);
	return true;
}
@RequestMapping(path="/addLogin",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
public Boolean addLogin(@RequestBody Login log)  throws Exception   {
    this.service.addLogin(log);
    return true;
}
@RequestMapping(path="/loginTeacher",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
public Boolean loginTeacher(@RequestBody LoginTeacher login)  throws Exception   {
    this.service.loginTeacher(login);
    return true;
}

@RequestMapping(path="/loginStudent",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
public Boolean loginStudent(@RequestBody LoginStudent login)  throws Exception   {
    this.service.loginStudent(login);
    return true;
}
@RequestMapping(path="/updateSection",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON)
public Boolean updateSection(@RequestBody Report report)  throws Exception   {
	Boolean result = false;
    if(this.service.updateSection(report))
    	result = true;
    return result;
}















@RequestMapping(path="/getAdmin",produces = MediaType.APPLICATION_JSON)
public List<Admin> getAdmin() {
	List<Admin> list = this.service.getAdmin();
    return list; 
}
@RequestMapping(path="/getSection",produces = MediaType.APPLICATION_JSON)
public List<Report> getSection() {
	List<Report> list = this.service.getSection() ;
    return list; 
}

@RequestMapping(path="/getSubject",produces = MediaType.APPLICATION_JSON)
public List<Subject> getSubject() {
	List<Subject> list = this.service.getSubject();
    return list; 
}
@RequestMapping(path="/getStudent",produces = MediaType.APPLICATION_JSON)
public List<Student> getStudent() {
	List<Student> list = this.service.getStudent();
    return list; 
}
@RequestMapping(path="/getTeacher",produces = MediaType.APPLICATION_JSON)
public List<Teacher> getTeacher() {
	List<Teacher> list = this.service.getTeacher();
    return list; 
}
@RequestMapping(path="/getClass",produces = MediaType.APPLICATION_JSON)
public List<Attendance> getClasses() {
	List<Attendance> list = this.service.getClasses();
    return list; 
}
@RequestMapping(path="/getLogin",produces = MediaType.APPLICATION_JSON)
public List<LoginTeacher> getLogin() {
	List<LoginTeacher> list = this.service.getLogin();
    return list; 
}
@RequestMapping(path="/getLog",produces = MediaType.APPLICATION_JSON)
public List<LoginStudent> getLog() {
	List<LoginStudent> list = this.service.getLog();
    return list; 
}
@RequestMapping(path="/Login",produces = MediaType.APPLICATION_JSON)
public List<Login> Login() {
	List<Login> list = this.service.Login();
    return list; 
}







@RequestMapping(path="/deleteStudent/{id}",method = RequestMethod.DELETE )
public boolean deleteSubject(@PathVariable("id") String id) {	
    return this.service.deleteStudent(id);
}

@RequestMapping(path="/deleteSubject/{id}",method = RequestMethod.DELETE )
public boolean deleteStudent(@PathVariable("id") String id) {	
    return this.service.deleteSubject(id);
}
@RequestMapping(path="/deleteTeacher/{id}",method = RequestMethod.DELETE )
public boolean deleteTeacher(@PathVariable("id") String id) {
    return this.service.deleteTeacher(id);
}
@RequestMapping(path="/deleteLoginStudent/{id}",method = RequestMethod.DELETE )
public boolean deleteLoginStudent(@PathVariable("id") String id) {
	
    return this.service.deleteLoginStudent(id);
}

@RequestMapping(path="/deleteLoginTeacher/{check}",method = RequestMethod.DELETE )
public boolean deleteLoginTeacher(@PathVariable("check") String id) {
    return this.service.deleteLoginTeacher(id);
}


    


}
