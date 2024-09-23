package com.courier.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courier.controller.entity.UserEntity;

public interface UserDao  extends JpaRepository<UserEntity, String>{

}
