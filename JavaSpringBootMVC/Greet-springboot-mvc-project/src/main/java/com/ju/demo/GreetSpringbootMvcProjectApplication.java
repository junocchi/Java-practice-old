package com.ju.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ju")
public class GreetSpringbootMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetSpringbootMvcProjectApplication.class, args);
	}

}
