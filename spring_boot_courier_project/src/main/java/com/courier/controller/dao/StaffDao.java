package com.courier.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courier.controller.entity.StaffEntity;

public interface StaffDao  extends JpaRepository<StaffEntity, String>{

}
