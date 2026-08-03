package com.jpa.example.course_jpa_example;

import com.jpa.example.course_jpa_example.entity.User;
import com.jpa.example.course_jpa_example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseJpaExampleApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(CourseJpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setUserId(101);
		user.setName("Monish");
		user.setAge(22);
		user.setActive(true);
		User SavedUser = userRepository.save(user);
		System.out.println(SavedUser.getName());
		System.out.println("User Saved");

	}
}
