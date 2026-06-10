package com.core.concepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args){
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        engine e1=  container.getBean("e",engine.class);
        e1.startEngine();
    }
}
