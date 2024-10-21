package com.question7.question7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Question7Application {

	public static void main(String[] args) {
		SpringApplication.run(Question7Application.class, args);
		Employee employee = new Employee("Aditya Ranjan", 21, "Software Developer", 75000.0);
		employee.displayInfo();
	}

}
