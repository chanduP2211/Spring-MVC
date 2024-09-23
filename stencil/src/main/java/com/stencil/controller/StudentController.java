package com.stencil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.stencil.entity.Student;
import com.stencil.service.ServiceLayer;

@RestController
@CrossOrigin(origins = "http://localhost:3333/")
public class StudentController {

	
	@Autowired
	private ServiceLayer service;
	
	@PostMapping(path="/addStudent",consumes = {"application/json"})
	   public void addStudent(@RequestBody Student student) {
	    this.service.addStudent(student);
  }
  
	@GetMapping(path="/getStudent")
      public List<Student> getStudent() {
   	   List<Student> al =  this.service.getStudent();
		   return al;
   }
	@DeleteMapping(path= "/deleteStudent/{id}")
	  public void deleteStudent(@PathVariable("id") String id) {
		 this.service.deleteStudent(id);
	 }
	
}
