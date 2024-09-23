package com.stencil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stencil.entity.LoginStudent;

public interface LoginStudentRepo  extends JpaRepository<LoginStudent, String>{

}
