package practice.demo.playload.example;

import jakarta.validation.constraints.*;

public class UserData {
    // what data we want from the user
    @NotEmpty(message = "Name is Required")
    @Size(min = 3,max = 12,message = "please put valid length of the name ")
    private String name;
   @Min(value = 18,message = "minimum value required is 18")
   @Max(value = 99,message = "Maximum value can be 99 only")
    private int age;
    @Email(message = "Invalid email")
    private String email;
    @NotEmpty(message = "Password Required")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
