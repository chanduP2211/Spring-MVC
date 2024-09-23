package com.stencil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stencil.entity.Admin;


public interface AdminRepo extends JpaRepository<Admin, String> {

}
