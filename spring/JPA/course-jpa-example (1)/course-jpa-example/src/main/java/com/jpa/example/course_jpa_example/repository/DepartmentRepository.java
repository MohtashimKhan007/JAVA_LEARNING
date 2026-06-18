package com.jpa.example.course_jpa_example.repository;

import com.jpa.example.course_jpa_example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository  extends JpaRepository<Department,Integer> {
}
