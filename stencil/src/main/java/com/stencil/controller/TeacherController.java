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


import com.stencil.entity.Teacher;
import com.stencil.service.ServiceLayer;

@RestController
@CrossOrigin(origins = "http://localhost:3333/")
public class TeacherController {

	
	@Autowired
	private ServiceLayer service;
	
	@PostMapping(path="/addTeacher",consumes = {"application/json"})
	   public void addTeacher(@RequestBody Teacher teacher) {
	    this.service.addTeacher(teacher);
  }
	@GetMapping(path="/getTeacher")
      public List<Teacher> getTeacher() {
   	   List<Teacher> al =  this.service.getTeacher();
		   return al;
   }
	@DeleteMapping(path= "/deleteTeacher/{id}")
	  public void deleteTeacher(@PathVariable("id") String id) {
		 this.service.deleteTeacher(id);
	 }
	
	
}
