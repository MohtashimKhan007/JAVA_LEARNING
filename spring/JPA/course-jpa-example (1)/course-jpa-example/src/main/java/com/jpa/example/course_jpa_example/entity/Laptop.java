package com.jpa.example.course_jpa_example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private String about;

    //user mapping
//    @OneToOne
//    private  User user;
    // when one user have multiple laptops
    @ManyToOne
     private User user;



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
