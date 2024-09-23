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

import com.stencil.entity.LoginTeacher;
import com.stencil.service.ServiceLayer;

@RestController
@CrossOrigin(origins = "http://localhost:3333/")
public class LoginTeacherController {

	
	@Autowired
	private ServiceLayer service;
	
	@PostMapping(path="/addLoginTeacher",consumes = {"application/json"})
	   public void addLoginTeacher(@RequestBody LoginTeacher login) {
	    this.service.addLoginTeacher(login);
   }
	@GetMapping(path="/getLoginTeacher")
      public List<LoginTeacher> getLogin() {
   	   List<LoginTeacher> al =  this.service.getLoginTeacher();
		   return al;
   }
	@DeleteMapping(path="/deleteLoginTeacher/{id}")
    public void deleteLoginTeacher(@PathVariable("id") String id) {
 	  this.service.deleteLoginTeacher(id);	
   }	
	
	
}
