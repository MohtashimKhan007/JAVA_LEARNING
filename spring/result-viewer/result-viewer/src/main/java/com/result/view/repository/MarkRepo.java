package com.result.view.repository;

import com.result.view.entity.Mark;
import com.result.view.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepo extends JpaRepository<Mark, Long> {

//    for finding out the marks of any particular student
    List<Mark> findByStudent(Student student);
}
