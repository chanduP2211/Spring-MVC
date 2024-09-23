package com.stencil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stencil.entity.Section;
import com.stencil.entity.Admin;
import com.stencil.entity.Attendance;
import com.stencil.entity.LoginStudent;
import com.stencil.entity.LoginTeacher;
import com.stencil.entity.Report;
import com.stencil.entity.Student;
import com.stencil.entity.Subject;
import com.stencil.entity.Teacher;
import com.stencil.repository.AdminRepo;
import com.stencil.repository.AttendanceRepo;
import com.stencil.repository.LoginStudentRepo;
import com.stencil.repository.LoginTeacherRepo;
import com.stencil.repository.ReportRepo;
import com.stencil.repository.SectionRepo;
import com.stencil.repository.StudentRepo;
import com.stencil.repository.SubjectRepo;
import com.stencil.repository.TeacherRepo;

@Service
public class ServiceLayer {
   
   @Autowired
   private AdminRepo adminRepo;
   @Autowired
   private AttendanceRepo attendanceRepo;
   @Autowired
   private LoginTeacherRepo loginTeacherRepo;
   @Autowired
   private LoginStudentRepo loginStudentRepo;
   @Autowired
   private ReportRepo reportRepo;
   @Autowired
   private StudentRepo studentRepo;
   @Autowired
   private SubjectRepo subjectRepo;
   @Autowired
   private TeacherRepo teacherRepo;
   @Autowired
   private SectionRepo sectionRepo;

   
   
   
   public void addAdmin(Admin admin) {
	    this.adminRepo.save(admin);
   }
   public void addStudent(Student student) {
	    this.studentRepo.save(student);
  }
   public void addTeacher(Teacher teacher) {
	    this.teacherRepo.save(teacher);
  }
   public void addSubject(Subject subject) {
	    this.subjectRepo.save(subject);
  }
   public void addReport(Report report) {
	    this.reportRepo.save(report);
  }
   public void addAttendance(Attendance attendance) {
	    this.attendanceRepo.save(attendance);
  }
   public void addLoginStudent(LoginStudent l_student) {
	    this.loginStudentRepo.save(l_student);
  }
   public void addLoginTeacher(LoginTeacher l_teacher) {
	    this.loginTeacherRepo.save(l_teacher);
  }
	   public void addSection(Section section) {
	    this.sectionRepo.save(section);
}
   public List<Section> getSection() {
	   List<Section> al = this.sectionRepo.findAll();
		   return al;
}
   
   
   
   
   
   
   public  List<Admin> getAdmin() {
	   List<Admin> al =  this.adminRepo.findAll();
	   return al;
  }
   public  List<Student> getStudent() {
	   List<Student> al =  this.studentRepo.findAll();
	   return al;
  }
  public List<Teacher> getTeacher() {
	   List<Teacher> al =  this.teacherRepo.findAll();
	   return al;
 }
  public List<Subject> getSubject() {
	  List<Subject> al =  this.subjectRepo.findAll();
	   return al;
 }
  public List<Report> getReport() {
	  List<Report> al =  this.reportRepo.findAll();
	   return al;
 }
  public List<Attendance> getAttendance() {
	  List<Attendance> al =  this.attendanceRepo.findAll();
	   return al;
 }
  public  List<LoginStudent> getLoginStudent() {
	  List<LoginStudent> al =  this.loginStudentRepo.findAll();
	   return al;
 }
  public List<LoginTeacher> getLoginTeacher() {
	  List<LoginTeacher> al =  this.loginTeacherRepo.findAll();
	   return al;
 }
	  
   
   

  
  
  public  void deleteStudent(String id) {
	 this.studentRepo.deleteById(id);
 }
 public void deleteTeacher(String id) {
	 this.teacherRepo.deleteById(id);

}
 public void deleteSubject(String id) {
	 this.subjectRepo.deleteById(id);
}
 public void deleteLoginTeacher(String id) {
	 this.loginTeacherRepo.deleteById(id);
}
 public void deleteLoginStudent(String id) {
	 this.loginStudentRepo.deleteById(id);
}
 
 
 
 
}
