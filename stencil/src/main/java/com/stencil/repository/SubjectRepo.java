package com.stencil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stencil.entity.Subject;

public interface SubjectRepo  extends JpaRepository<Subject, String>{


}
