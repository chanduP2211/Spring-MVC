package com.courier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courier.controller.entity.ComplaintEntity;
import com.courier.controller.entity.CourierEntity;
import com.courier.controller.entity.CurrentUserEntity;
import com.courier.controller.entity.LocationEntity;
import com.courier.controller.entity.ShoppingEntity;
import com.courier.controller.entity.UserEntity;
import com.courier.controller.service.ServiceLayer;

@RestController
@CrossOrigin(origins="http://127.0.0.1:5500/")
public class UserController {
	
	@Autowired
	private ServiceLayer service;
	
	// courierMethods--------------------------------
	@PostMapping(value="/insertCourierDetails")
	public String   insertCourierDetails(@RequestBody CourierEntity address) {
		this.service.insertCourier(address);
		return "true";
	}
	
	@GetMapping(value="/getAllCourierDetails")
	public List<CourierEntity>   getAllCourierDetails() {
		List<CourierEntity> list  = this.service.getAllCouriers();
		return list;
	}
	
	@DeleteMapping(value="/deleteDetails/{id}")
	public String   deleteDetails(@PathVariable String id) {
		List<CourierEntity> list  = this.service.getAllCouriers();
		int flag = 0;
		for(CourierEntity entity : list) {
			if(entity.getTrackId().equals(id)) {
				this.service.deleteCourier(entity);	
				flag=1;
			}
		}
		
		if(flag==1)
		return "true";
		else
			return "false";
	}
	
	// currentUserMethods--------------------------------------------
	//insert
	@PostMapping(value= "/insertCurrentUser")
	public  Boolean   insertCurrentUser(@RequestBody CurrentUserEntity entity) {
		this.service.insertCurrentUser(entity);
		
		return true;	
	}
	//getAll
	@GetMapping(value= "/getCurrentUser")
	public  List<CurrentUserEntity>   getCurrenttUser() {
		List<CurrentUserEntity> entity = this.service.getCurrentUsers();
		return entity;	
	}
	//delete
	@DeleteMapping(value="/deleteCurrentUser/{email}")
	public String   deleteCurrentUser(@PathVariable String email) {
		List<CurrentUserEntity> list  = this.service.getCurrentUsers();
		int flag = 0;
		for(CurrentUserEntity entity : list) {
			if(entity.getEmail().equals(email)) {
				this.service.deleteCurrentUser(entity);	
				flag=1;
			}
		}
		if(flag==1)
		return "true";
		else
			return "false";
	}
	
	// Location methods------------------------------------------
	@PostMapping(value= "/insertLocation")
	public  Boolean   insertLocation(@RequestBody LocationEntity entity) {
		this.service.insertLocation(entity);
		
		return true;	
	}
	//getAll
	@GetMapping(value="/getAllLocations")
	public  List<LocationEntity>   getLocation() {
		List<LocationEntity> entity = this.service.getAllLocation();
		return entity;	
	}
	//delete
	@DeleteMapping(value="/deleteLocation/{id}")
	public String   deleteLocation(@PathVariable String id) {
		List<LocationEntity> list  = this.service.getAllLocation();;
		int flag = 0;
		for(LocationEntity entity : list) {
			if(entity.getId().equals(id)) {
				this.service.deleteLocation(entity);	
				flag=1;
			}
		}
		if(flag==1)
		return "true";
		else
			return "false";
	}
	// User methods-------------------------------------------------------
	//insert
	@PostMapping(value="/registerUser")
	public String    insertUser(@RequestBody UserEntity user) {
		this.service.insertUser(user);
		return "succesfull";
	}
	
	//get
	@GetMapping(value="/getAllUser")
	public List<UserEntity>   getAllUser() {
		
		List<UserEntity> list = this.service.getAllUsers();
		
		return list;
		
	}
	@PostMapping(value="/insertShoppingDetails")
	public String   insertShoppingDetails(@RequestBody ShoppingEntity shop) {
		this.service.insertShoppingDetails(shop);
		return "true";
	}
	
	@GetMapping(value="/getAllShoppingDetails")
	public List<ShoppingEntity>   getAllShoppingDetails() {
		List<ShoppingEntity> list  = this.service.getAllShoppingDetails();
		return list;
	}
	
	// complaint methods------------------------------------------------
	@PostMapping(value="/insertComplaint")
	public void insertTheComplaint(@RequestBody  ComplaintEntity entity) {
		this.service.insertComplaint(entity);
	}
	
	// getAllComplaints
	@GetMapping(value="/getAllComplaints")
		public List<ComplaintEntity> getAllComplaints(){
			List<ComplaintEntity> list = this.service.getAllComplaints();
			return list;	
		}
	
	
	
	
	
	
	

}
