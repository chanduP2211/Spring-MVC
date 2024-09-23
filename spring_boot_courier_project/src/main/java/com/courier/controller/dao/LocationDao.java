package com.courier.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courier.controller.entity.LocationEntity;

public interface LocationDao  extends JpaRepository<LocationEntity, String>{

}
