package com.courier.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courier.controller.entity.BranchEntity;

public interface BranchDao extends JpaRepository<BranchEntity, String> {

}
