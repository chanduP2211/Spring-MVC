package com.stencil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stencil.entity.Admin;
import com.stencil.service.ServiceLayer;

@RestController
@CrossOrigin(origins = "http://localhost:3333/")
public class AdminController {
	
	@Autowired
	private ServiceLayer service;
	
	@PostMapping(path="/addAdmin",consumes = {"application/json"})
	   public boolean addAdmin(@RequestBody Admin admin) {
	    this.service.addAdmin(admin);
	    return true;
   }
	
	@GetMapping(path="/getAdmin")
      public List<Admin> getAdmin() {
   	   List<Admin> al =  this.service.getAdmin();
		   return al;
   }	
   
}
