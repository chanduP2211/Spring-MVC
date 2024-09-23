package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import Entities.Admin;
import Entities.Attendance;
import Entities.LoginStudent;
import Entities.LoginTeacher;
import Entities.Report;
import Entities.Student;
import Entities.Subject;
import Entities.Teacher;
import Entities.Today;
import Entities.Login;

@Repository
public class Dao {
	  @Autowired
	  private HibernateTemplate template;
	  
	  
	  @Transactional
	public void addLogin(Login login) {
			this.template.saveOrUpdate(login);	
		}
	  @Transactional
	public Boolean updateSection(Report report) {
		this.template.saveOrUpdate(report);
		  return true;
	} 
	  @Transactional
	public Boolean insertAdmin(Admin admin) {
		this.template.saveOrUpdate(admin);
		  return true;
	}
	  @Transactional
	public Boolean insertStudent(Student student) {
		this.template.saveOrUpdate(student);
		  return true;
	}
	  @Transactional
	public Boolean insertSection(Report report) {
		this.template.saveOrUpdate(report);
			return true;
	}

	  @Transactional
		public Boolean insertTeacher(Teacher teacher) {
			this.template.saveOrUpdate(teacher);
			  return true;
		}
	  @Transactional
	public boolean insertSubject(Subject subject) {
		this.template.saveOrUpdate(subject);
		  return true;
	}
	  @Transactional
	public void addClass(Attendance attend) {
		this.template.saveOrUpdate(attend);
	}
	  @Transactional
	public void addToday(Today today) {
		this.template.saveOrUpdate(today);
	}
	  @Transactional
	public void loginTeacher(LoginTeacher login) {
			this.template.saveOrUpdate(login);
	}
		@Transactional
		public void loginStudent(LoginStudent login) {
		this.template.saveOrUpdate(login);
		}
		@Transactional
	public void addAttendance(Attendance attend) {
			this.template.saveOrUpdate(attend);
    } 
	  
	  
	  
	  
	  
	  @Transactional
	  public boolean deleteStudent(String id) {
		  Student student = (Student)this.template.get(Student.class, id);
		  this.template.delete(student);
		  return true;
	  } 
	  @Transactional
	  public boolean deleteTeacher(String id) {
		  Teacher teacher = (Teacher)this.template.get(Teacher.class, id);
		  this.template.delete(teacher);
		  return true;
	  }
	  @Transactional
	  public boolean deleteToday(String date) {
		  Today today = (Today)this.template.get(Today.class, date);
		  this.template.delete(today);
		  return true;
	  }
	  @Transactional
	  public boolean deleteSubject(String id) {
		 Subject student = (Subject)this.template.get(Subject.class, id);
		  this.template.delete(student);
		  return true;
	  }
		@Transactional
		public boolean deleteLoginStudent(String id) {
			LoginStudent student = (LoginStudent)this.template.get(LoginStudent.class, id);
			  this.template.delete(student);
			return true;
		}
		@Transactional
		public boolean deleteLoginTeacher(String id) {
			LoginTeacher teacher =  (LoginTeacher)this.template.get(LoginTeacher.class, id);
			  this.template.delete(teacher);
			return true;
		}
		
		




	public List<Admin> getAdmin() {
	
		return this.template.loadAll(Admin.class);
	}
	public List<Today> getToday() {
		
		return this.template.loadAll(Today.class);
	}
	public List<Login> Login() {
		return this.template.loadAll(Login.class);
	}
	public List<Report> getClasses(){
		  List<Report> li = this.template.loadAll(Report.class);
		  return li;
	  }
	  public List<Student> getStudents(){
		  List<Student> li = this.template.loadAll(Student.class);
		  return li;
	  }
	  public List<Attendance> getClases(){
		  List<Attendance> list = this.template.loadAll(Attendance.class);
		  return list;
	  }
	  public List<Teacher> getTeachers(){
		  List<Teacher> li = this.template.loadAll(Teacher.class);
		  return li;
	  }
	  public List<Subject> getSubjects(){
		  List<Subject> li = this.template.loadAll(Subject.class);
		  return li;
	  }	
		public List<LoginTeacher> getLogin() {
			return this.template.loadAll(LoginTeacher.class);
		}

		public List<LoginStudent> getLog() {
			return this.template.loadAll(LoginStudent.class);
		}


	
}
