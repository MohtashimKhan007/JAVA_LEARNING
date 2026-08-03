package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//if you want to return any page then you have to write @controller
@Controller
public class PageController {
    @RequestMapping("/about")
    public String about(){
        System.out.println("Return about page");
        return "about";
    }
}
