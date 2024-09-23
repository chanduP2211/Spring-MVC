package com.stencil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stencil.entity.Section;
import com.stencil.entity.Student;
import com.stencil.service.ServiceLayer;

@RestController
@CrossOrigin(origins = "http://localhost:3333/")
public class SectionController {

	@Autowired
	private ServiceLayer service;
	
	@PostMapping(path="/addSection",consumes = {"application/json"})
	   public void addSection(@RequestBody Section section) {
	    this.service.addSection(section);
  }
	@GetMapping(path="/getSection")
      public List<Section> getSection() {
   	   List<Section> al =  this.service.getSection();
		   return al;
	}
}
