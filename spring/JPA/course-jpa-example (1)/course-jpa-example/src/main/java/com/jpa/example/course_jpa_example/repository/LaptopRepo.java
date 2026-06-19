package com.jpa.example.course_jpa_example.repository;

import com.jpa.example.course_jpa_example.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
}
