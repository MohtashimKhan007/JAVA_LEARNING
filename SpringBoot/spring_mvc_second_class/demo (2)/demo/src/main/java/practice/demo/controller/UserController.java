package practice.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import practice.demo.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/")
    public void getuser(){
        System.out.println("User Getting");
    }
    @RequestMapping("/testing")

    public String user2(){
        return "Monish";
    }


    @RequestMapping("/player_list")
    public List<String> players(){

        String template = null;
        template.length();


        List<String> list = new ArrayList<>();
        list.add("Monish");
        list.add("Rahul");
        list.add("Ajay");
        return list;
    }


    @RequestMapping("/get_user")
    public User getUser(){
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setEmail("sachinjhanghu@gmail.com");
        user.setPassword("123456");
        user.setAddress("bijnor up");
        user.setName("Sachin");
        return user;

    }


}
