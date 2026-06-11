package com.core.concepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args){
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Engine e1=  container.getBean("e", Engine.class);
        e1.startEngine();
    }
}
