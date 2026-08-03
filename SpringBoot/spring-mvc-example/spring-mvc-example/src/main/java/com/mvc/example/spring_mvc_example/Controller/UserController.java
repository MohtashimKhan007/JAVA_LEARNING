package com.mvc.example.spring_mvc_example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @RequestMapping("/")
    public String getUser(){
        System.out.println("User Getting");
        String template = "This is Template";
        return template;
    }

    @RequestMapping("/player_list")
    public List<String> players(){
        List<String> list = new ArrayList<>();
        list.add("Sachin");
        list.add("Mohtashim");
        list.add("Shambhu");
        return list;
    }

}
