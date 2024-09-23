package com.courier.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courier.controller.entity.CourierEntity;

public interface CourierDetailsDao extends JpaRepository<CourierEntity, String>{

}
