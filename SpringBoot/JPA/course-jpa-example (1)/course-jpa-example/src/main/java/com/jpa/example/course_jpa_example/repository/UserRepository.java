package com.jpa.example.course_jpa_example.repository;

import com.jpa.example.course_jpa_example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
