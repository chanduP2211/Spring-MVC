package com.courier.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stencil.entity.AdminEntity;

public interface AdminDao extends JpaRepository<AdminEntity, String> {

}
