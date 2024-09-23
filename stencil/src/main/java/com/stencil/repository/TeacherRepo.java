package com.stencil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stencil.entity.Teacher;

public interface TeacherRepo  extends JpaRepository<Teacher, String>{

}
