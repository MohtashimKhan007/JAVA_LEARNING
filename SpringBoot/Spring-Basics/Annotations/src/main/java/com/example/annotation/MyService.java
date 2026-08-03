package com.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public void sayHello() {
        System.out.println("Hello! Spring ne successfully bean bana diya.");
    }
}