package com.result.view.repository;

import com.result.view.entity.Mark;
import com.result.view.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Integer> {

//    Optional<Student> findByUsername(String username);
//    Optional<Student> findByEmail(String email);
//    Optional<Student> findByUsernameAndPassword(String username,String password);


    // important -> for fetching the data by the help of the roll number and date of birth
    Optional<Student> findByRollNumber(String rollNumber);
    Optional<Student> findByRollNumberAndDateOfBirth(String rollNumber, LocalDate dateOfBirth);


}
