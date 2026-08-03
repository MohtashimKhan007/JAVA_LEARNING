package com.mvc.example.spring_mvc_example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {


    @RequestMapping("/home")
    public String home(){
        System.out.println("this is home page");
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("This is about page");
        return "about";
    }
}
