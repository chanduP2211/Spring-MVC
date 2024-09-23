package com.stencil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stencil.entity.Student;

public interface StudentRepo  extends JpaRepository<Student, String>{

}
