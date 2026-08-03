package com.result.view.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "result_viewer_marks")
public class Mark {

    // this is marks id for the auto increment id do this ->
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private String marks;
    private String maxMarks;
    private String feedback;
    private String grade;

    @ManyToOne
    private Student student;

}
