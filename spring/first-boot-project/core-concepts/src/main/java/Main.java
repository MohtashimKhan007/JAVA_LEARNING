package com.core.concepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //program wil start from this main

        // 1. Spring ko bata rahe hain ki config.xml file kahan hai
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        // here we are saying that read config.xml file and set everything acc to it
        // 2. Spring se 'car' ka object mang rahe hain (jo usne XML ke hisab se banaya hai)
        car myCar = (car) context.getBean("car");

        // 3. Ab car ko start karo
        myCar.start();
    }
}