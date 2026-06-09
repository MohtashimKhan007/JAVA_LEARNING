package com.first.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component  will make this a bean
@RestController
public class HomeController {
    @RequestMapping("/Magic")
  public String test(){
      return "This is Magic";
  }

  @RequestMapping("/more")
    public String test2(){
        return "This is more info";
  }
}
