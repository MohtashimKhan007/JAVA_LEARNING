package com.mvc.example.spring_mvc_example.Controller.admin;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/home")

    public String adminHome(Model model){

        // if we want to take this title and userList to the view(admin/home) so we use Model here
        String title = "Admin Home";
        List<String> userList = List.of("Monish","Rahul","user3");

//        here we are putting data inside the model in key value pair
//        now if we fetch title inside admin/home then we get first value
        model.addAttribute("title",title);
        model.addAttribute("userList",userList);

        return "admin/home";
    }
}
