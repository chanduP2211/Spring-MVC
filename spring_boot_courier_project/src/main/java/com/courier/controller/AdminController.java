package com.courier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courier.controller.entity.BranchEntity;
import com.courier.controller.entity.StaffEntity;
import com.courier.controller.service.ServiceLayer;
import com.stencil.entity.AdminEntity;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500/")
public class AdminController {
	@Autowired
	private ServiceLayer service;
	
	// Branch methods------------------------------------
	//get
	@GetMapping(value="/getAllBranch")
	public List<BranchEntity> getAllBranch(){
		List<BranchEntity> list = this.service.getAllBranch();
		
		return list;
		
	}
	//insert
	@PostMapping(value="/insertBranch")
	public String  insertBranch(@RequestBody BranchEntity entity){
		this.service.insertBranch(entity);
		return "true";
	}
	
	// staff methods-----------------------------------------
	//get
	@GetMapping(value="/getAllStaff")
	public List<StaffEntity> getAllStaff(){
		List<StaffEntity> list = this.service.getAllStaff();
		
		return list;
		
	}
	//insert
	@PostMapping(value="/insertStaff")
	public String  insertStaff(@RequestBody StaffEntity entity){
		this.service.insertStaff(entity);
		return "true";
	}
	
	// Admin methods-------------------------------------------------
	//insert
		@PostMapping(value="/registerAdmin")
		public String    insertUser(@RequestBody AdminEntity user) {
			this.service.insertAdmin(user);
			return "succesfull";
		}
		
		//get
		@GetMapping(value="/getAlladmin")
		public List<AdminEntity>   getAllUser() {
			
			List<AdminEntity> list = this.service.getAllAdminUsers();
			
			return list;
			
		}
	
	
	
	
	

}
