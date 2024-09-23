package com.stencil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stencil.entity.Attendance;

public interface AttendanceRepo extends JpaRepository<Attendance, Integer> {

}
