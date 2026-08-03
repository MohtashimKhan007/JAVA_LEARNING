package com.example.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//       MyService service = context.getBean(MyService.class);
//        service.sayHello();
        MyController controller = (MyController) context.getBean(MyController.class);
        controller.callService();
    }
}