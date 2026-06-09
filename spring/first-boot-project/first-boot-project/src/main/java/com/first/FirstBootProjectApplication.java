package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // this is the combination of configuration, componentScan,
public class FirstBootProjectApplication {

	public static void main(String[] args) {
		// This is Starting your spring boot application
		//here SprintApplication is a class and run method is returning the configurable Application context along with running
//		ConfigurableApplicationContext  container =   SpringApplication.run(FirstBootProjectApplication.class, args);
//		HomeController controller = container.getBean("homeController", HomeController.class);
//		System.out.println(controller);

		SpringApplication.run(FirstBootProjectApplication.class, args);
	}

}
