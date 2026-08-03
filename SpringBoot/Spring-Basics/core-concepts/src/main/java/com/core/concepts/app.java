package com.core.concepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args){
//        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
//
//        Engine e1=  container.getBean("e", Engine.class);
//        e1.startEngine();

//    ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
//        class path xml ke pass close() nhi hota so we are using annotaion
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ConfigClass.class);
        Car car = container.getBean("car",Car.class);

        car.start();

        container.close();
    }
}
