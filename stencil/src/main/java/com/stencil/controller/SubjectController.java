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

import com.stencil.entity.Subject;
import com.stencil.service.ServiceLayer;

@RestController
@CrossOrigin(origins = "http://localhost:3333/")
public class SubjectController {

	
	
	@Autowired
	private ServiceLayer service;
	
	@PostMapping(path="/addSubject",consumes = {"application/json"})
	   public void addSubject(@RequestBody Subject subject) {
	    this.service.addSubject(subject);
  }
	@GetMapping(path="/getSubject")
      public List<Subject> getSubject() {
   	   List<Subject> al =  this.service.getSubject();
		   return al;
   }
	@DeleteMapping(path= "/deleteSubject/{subject}")
	  public void deleteTeacher(@PathVariable("subject") String subject) {
		 this.service.deleteSubject(subject);
	 }
	
	
}
