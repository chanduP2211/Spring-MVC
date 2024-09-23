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

import com.stencil.entity.LoginStudent;
import com.stencil.service.ServiceLayer;

@RestController
@CrossOrigin(origins = "http://localhost:3333/")
public class LoginStudentController {

	
	
	@Autowired
	private ServiceLayer service;
	
	@PostMapping(path="/addLoginStudent",consumes = {"application/json"})
	   public void addLoginStudent(@RequestBody LoginStudent login) {
	    this.service.addLoginStudent(login);
   }
	@GetMapping(path="/getLoginStudent")
      public List<LoginStudent> getLogin() {
   	   List<LoginStudent> al =  this.service.getLoginStudent();
		   return al;
   }	
	
	@DeleteMapping(path="/deleteLoginStudent/{id}")
    public void deleteLogin(@PathVariable("id") String id) {
 	  this.service.deleteLoginStudent(id);	
 }	
  
	
	
}
