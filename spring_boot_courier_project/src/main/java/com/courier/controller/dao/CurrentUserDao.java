package com.courier.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courier.controller.entity.CurrentUserEntity;

public interface CurrentUserDao  extends JpaRepository<CurrentUserEntity, String>{

}
