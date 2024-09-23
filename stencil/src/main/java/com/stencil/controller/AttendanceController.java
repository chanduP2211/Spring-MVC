package com.stencil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stencil.entity.Attendance;
import com.stencil.service.ServiceLayer;

@RestController
@CrossOrigin(origins = "http://localhost:3333/")
public class AttendanceController {

	
	@Autowired
	private ServiceLayer service;
	
	@PostMapping(path="/addAttendance",consumes = {"application/json"})
	   public void addAttendance(@RequestBody Attendance attendance) {
	    this.service.addAttendance(attendance);
  }
	@GetMapping(path="/getAttendance")
      public List<Attendance> getAttendance() {
   	   List<Attendance> al =  this.service.getAttendance();
		   return al;
   }
	
	
}
