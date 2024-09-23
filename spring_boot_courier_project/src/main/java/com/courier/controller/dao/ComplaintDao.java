package com.courier.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courier.controller.entity.ComplaintEntity;

public interface ComplaintDao  extends JpaRepository<ComplaintEntity,String>{

}
