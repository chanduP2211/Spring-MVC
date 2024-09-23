package com.stencil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.stencil.entity.Report;
import com.stencil.service.ServiceLayer;

@RestController
@CrossOrigin(origins = "http://localhost:3333/")
public class ReportController {

	
	
	@Autowired
	private ServiceLayer service;
	
	@PostMapping(path="/addReport",consumes = {"application/json"})
	   public void addReport(@RequestBody Report report) {
	    this.service.addReport(report);
  }
	@GetMapping(path="/getReport")
      public List<Report> getAttendance() {
   	   List<Report> al =  this.service.getReport();
		   return al;
   }
	
	
}
