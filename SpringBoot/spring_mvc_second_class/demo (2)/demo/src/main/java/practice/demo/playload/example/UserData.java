package practice.demo.playload.example;

import jakarta.validation.constraints.*;
import practice.demo.Utils.ValidGender;

public class UserData {
    // what data we want from the user
    @NotEmpty(message = "Name is Required")
    @Size(min = 3,max = 12,message = "please put valid length of the name ")
    // Must Contain One Capital Letter and one digit and one special Character
    @Pattern( regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",message = "Invaid userName. Username must containt 1 captial letter, one digit and one special character")
    private String name;
   @Min(value = 18,message = "minimum value required is 18")
   @Max(value = 99,message = "Maximum value can be 99 only")
    private int age;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Email(message = "Invalid email")
    private String email;
    @NotEmpty(message = "Password Required")
    private String password;

    // if we have to add the custom validations for the gender we interface so firstly we create a package called utils called ValidGender and can use it here
    @ValidGender(message = "only male and female is allowed")
    private String gender;
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
