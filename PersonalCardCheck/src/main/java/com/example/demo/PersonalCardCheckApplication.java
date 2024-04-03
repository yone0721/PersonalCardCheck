package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonalCardCheckApplication {

	public static void main(String[] args) {
//		ApplicationContext di = new AnnotationConfigApplicationContext(PersonalCardConfig.class);
		
		SpringApplication.run(PersonalCardCheckApplication.class, args);
	}

}
