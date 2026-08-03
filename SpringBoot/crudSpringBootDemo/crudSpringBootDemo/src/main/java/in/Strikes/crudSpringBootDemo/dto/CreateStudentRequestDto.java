package in.Strikes.crudSpringBootDemo.dto;

import jakarta.validation.constraints.*;

public class CreateStudentRequestDto {
    @NotBlank(message = "Name cannot be Null, blank or empty")
    @Size(min = 2,max = 50, message = "Student name must be between 2 and 50")
    private String name;
    @NotNull(message = "Age is Required")
    @Min(value = 18,message = "Student must be greater then 18")
    private Integer age;
    @NotBlank(message = "Student email cannot be blank")
    @Email(message = "Student email must be valid")
    private String email;
    @NotNull(message = "Roll no is Required")
    private Integer rollNo;
    @NotBlank(message = "Subject is Required")
    private String subject;

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
