package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    @Autowired
    private MyService myService;
    public void callService() {
        myService.sayHello();
    }
}