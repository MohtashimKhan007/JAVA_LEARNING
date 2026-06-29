package practice.demo.controller.example;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import practice.demo.playload.example.LoginRequest;
import practice.demo.playload.example.UserData;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    // logger declare
    Logger logger = LoggerFactory.getLogger(AuthController.class);




    // login
    //If We Dontt  Know Which Type of Data is Coming -> so we create a class for that
    // for example we have created the loginRequest class and we can use that class as a type like below
    // for genertic purpose we can also use map but that is not recommended
//    @RequestMapping(value = "/login",method = RequestMethod.GET)


    @GetMapping("/login")
    public LoginRequest login(@RequestBody LoginRequest loginRequest){
        String test = null; // making null so to check nullpointer exception
        test.length();
        logger.info("loginRequest: {}",loginRequest);
        return loginRequest;

    }



//    Signup -> here we have to take the input from the user but because of large amount of data
//    and the security Reason we will not use the query parameters -> so we use RequestBody

//    @RequestMapping(value = "/signup",method = RequestMethod.POST) -> older way
    @PostMapping("/signup")
    public String signup(
            @Valid  @RequestBody UserData userData, @RequestHeader("User-Agent") String agent){


        //the System.out.println will print the data on console but we want more control
        //so that we can log on file, can change the printing format so we need login framework
        // we need inbuilt login framework in springboot
        // for that we use
//        private Logger logger = LoggerFactory.getLogger(AuthController.class);
        // here LoggerFactory is a class name
        // getLogger -> this is a method inside the LoggerFactory class
        // AuthController -> this is our class name
        // we give the name of our class so that to know from which class this came

//        System.out.println(userData.); // so we will not this we use logger how lets see

        logger.info("name: {}", userData.getName());
        // this will take the value of Get name from the userData and put inside placeholder
        logger.info("age, {}", userData.getAge());
        logger.info("email: {}", userData.getEmail());
        logger.info("password: {}", userData.getPassword());
        //printing the value of the agent
        logger.info("user-agent:{}",agent);


        // Now here we Got the data as input on console we print we got the data
        return "We Got the Data";

    }

    //Exception handling method
//   @ExceptionHandler(NullPointerException.class)
//    public String handleNullPointerException(NullPointerException ex){
//        logger.error(ex.getMessage());
//        ex.printStackTrace();
//
//        return ex.getMessage();
//    }
//
//
//    // This exception is for Method Argument Not valid exception
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public String handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
//        logger.error(ex.getMessage());
//        ex.printStackTrace();
//
//        return "Your Input Data Not Valid";
//    }

    // Commented these exception because we are going to use these exception in the exception folder for global use




}
