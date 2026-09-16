package com.coderarmy.jpaRelationshipDemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @OneToMany(
//            mappedBy = "department",
//            cascade = CascadeType.REMOVE
//
//    )
    // here Cascade type ka use -> if i am delete the department then also delete all the student from that department also
    // and if i am creating the department then also  create these students
//    private List<Student> students = new ArrayList<>();
}
