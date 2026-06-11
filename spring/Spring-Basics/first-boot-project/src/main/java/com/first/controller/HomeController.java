package com.first.controller;

import pack.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component  will make this a bean
@RestController
public class HomeController {

    @Autowired
    private Student stu;
    @RequestMapping("/Magic")
  public String test(){
      return "This is Magic";
  }

  @RequestMapping("/more")
    public String test2(){
        return "This is more info";
  }
}
