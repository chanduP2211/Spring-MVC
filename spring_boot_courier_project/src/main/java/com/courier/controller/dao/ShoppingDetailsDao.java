package com.courier.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courier.controller.entity.ShoppingEntity;

public interface ShoppingDetailsDao  extends JpaRepository<ShoppingEntity, String>{

}
