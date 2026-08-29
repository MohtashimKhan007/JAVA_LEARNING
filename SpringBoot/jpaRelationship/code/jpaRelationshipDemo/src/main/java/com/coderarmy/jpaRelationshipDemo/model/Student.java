package com.coderarmy.jpaRelationshipDemo.model;

import com.coderarmy.jpaRelationshipDemo.controller.DepartmentController;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "dept_Id")
    // ye dept_id name se column hoga student table me hi or vo null nhi ho saktaa
    private Department department;

//    private void addDepartment(Department department){
//        this.department = department;
//        this.department.getStudents().add(this);
//    }
//
//    private  void removeDepartment(Department department){
//        this.department=null;
    //        this.department.remove(this)
//    }


}
