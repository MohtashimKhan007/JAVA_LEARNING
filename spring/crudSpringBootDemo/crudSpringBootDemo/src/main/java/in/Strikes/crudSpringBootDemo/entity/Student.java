package in.Strikes.crudSpringBootDemo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // suppose we have to store the name as the first name and the last name but for that we have to inform the user that they have to send the firstname,lastname
    // in the body butt we don't want that
    // what does this mean -> internal logic is tightly coupled with the  client

    // for this problem we use the DTO -> DATA TRANSFER OBJECT(this is a pojo class -> plain old java object)
    // this pojo class contains only those fields which we want to take from the user and which we want to return to the user
    // so we can create two dto one is request dto and one is response dto
    private String name;
    private int age;
    private String email;
    private int rollNo;
    private String subject;
    // we Don't expect below three thing from the user because we don't want the user to decide the value of the
//    createdAt value means at what time the record is created or deleted so for that we have to use the validations and
//    same for the deleted value  so that student cant set the value -> deleted true
    // for the deleted we have already done the validation by making it false
    // one more thing we don't want to show these values to the user like deleted value why i have to tell the user that we have use the deleted for the soft delete
    private boolean deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
