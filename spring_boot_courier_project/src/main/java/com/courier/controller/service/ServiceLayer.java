package com.courier.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courier.controller.dao.AdminDao;
import com.courier.controller.dao.BranchDao;
import com.courier.controller.dao.ComplaintDao;
import com.courier.controller.dao.CourierDetailsDao;
import com.courier.controller.dao.CurrentUserDao;
import com.courier.controller.dao.LocationDao;
import com.courier.controller.dao.ShoppingDetailsDao;
import com.courier.controller.dao.StaffDao;
import com.courier.controller.dao.UserDao;
import com.courier.controller.entity.BranchEntity;
import com.courier.controller.entity.ComplaintEntity;
import com.courier.controller.entity.CourierEntity;
import com.courier.controller.entity.CurrentUserEntity;
import com.courier.controller.entity.LocationEntity;
import com.courier.controller.entity.ShoppingEntity;
import com.courier.controller.entity.StaffEntity;
import com.courier.controller.entity.UserEntity;
import com.stencil.entity.AdminEntity;

@Service
public class ServiceLayer {
	
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private UserDao userDao;
	
	
	@Autowired
	private StaffDao staffDao;
	
	@Autowired
	private BranchDao branchDao;
	@Autowired
	private CourierDetailsDao courierDao;
	@Autowired
	private CurrentUserDao currentUserDao;
	@Autowired
	private LocationDao locationDao;
	@Autowired
	private ShoppingDetailsDao shoppingDao;
	@Autowired
	private ComplaintDao complaintDao;
	
	// Branch methods---------------------------------------------------
	public List<BranchEntity> getAllBranch(){
		List<BranchEntity> list = this.branchDao.findAll();	
	return list;	
	}
	public void  insertBranch( BranchEntity entity){
		this.branchDao.save(entity);
	}
	// staff methods-----------------------------------------------------
	public List<StaffEntity> getAllStaff(){
		List<StaffEntity> list = this.staffDao.findAll();
		
	return list;
		
	}
	public void  insertStaff( StaffEntity entity){
		this.staffDao.save(entity);
	}
	
	// courier methods------------------------------------------------------
	public void insertCourier(CourierEntity entity) {
		
		this.courierDao.save(entity);
		
	}
	
	public List<CourierEntity> getAllCouriers(){
		
		List<CourierEntity> list = this.courierDao.findAll();
		return list;
	}
	public void deleteCourier(CourierEntity entity) {
		this.courierDao.delete(entity);
	}
	
	// CurrentUserMethod------------------------------------------
public void insertCurrentUser(CurrentUserEntity entity) {
		
		this.currentUserDao.save(entity);
		
	}
	
	public List<CurrentUserEntity> getCurrentUsers(){
		
		List<CurrentUserEntity> list = this.currentUserDao.findAll();
		return list;
	}
	public void deleteCurrentUser(CurrentUserEntity entity) {
		this.currentUserDao.delete(entity);
	}
	
	// Location methods---------------------------------------------
	public void insertLocation(LocationEntity loc) {
		this.locationDao.save(loc);
	}
	
	// get All data
	public List<LocationEntity> getAllLocation(){
		List<LocationEntity>  list = this.locationDao.findAll();
		return list;
	}
	
	// delete data
	public void deleteLocation(LocationEntity loc) {
		this.locationDao.delete(loc);
	}
	// Admin methods-------------------------------------------------
	public void insertAdmin(AdminEntity user) {
		this.adminDao.save(user);
	}
	// update
	public void updateAdmin(AdminEntity user) {
		this.adminDao.save(user);
	}

	// delete
	public void deleteAdmin( AdminEntity user) {
		this.adminDao.delete(user);
	}

	// get all data
	public List<AdminEntity> getAllAdminUsers(){
		List<AdminEntity> list = this.adminDao.findAll();
		return list;
	}
	// get element by id
	public AdminEntity getAdminUsersByEmail(String email){
		AdminEntity admin  = this.adminDao.getById(email);
		return admin;
	}
	
	// userMethods----------------------------------------------------------
	
	public void insertUser(UserEntity user) {
		this.userDao.save(user);
	}
	// update
	public void updateUser(UserEntity user) {
		this.userDao.save(user);
	}

	// delete
	public void deleteUser( UserEntity user) {
		this.userDao.delete(user);
	}

	// get all data
	public List<UserEntity> getAllUsers(){
		List<UserEntity> list = this.userDao.findAll();
		return list;
	}
	// get element by id
	public UserEntity getUsersByEmail(String email){
		UserEntity admin  = this.userDao.getById(email);
		return admin;
	}

	
	
	// shoppingDetailsMethods--------------------------------------------------
	// getAllDetails
	public List<ShoppingEntity> getAllShoppingDetails(){
		List<ShoppingEntity> list = this.shoppingDao.findAll();
		return list;	
	}
	// insertDetails
	public void insertShoppingDetails(ShoppingEntity entity) {
		this.shoppingDao.save(entity);
	}
	//updatedetails
	public void updateShoppingDetails(ShoppingEntity entity) {
		this.shoppingDao.save(entity);
		
	}
	
	// ComplaintsMethod------------------------------------------------------------
	// addcomplaint
	public void insertComplaint(ComplaintEntity entity) {
		this.complaintDao.save(entity);
	}
	
	// getAllComplaints
		public List<ComplaintEntity> getAllComplaints(){
			List<ComplaintEntity> list = this.complaintDao.findAll();
			return list;	
		}
	

}
