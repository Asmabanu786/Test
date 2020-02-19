package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@override
	ptrotected SpringApplicationBuilder configure(org.springframework.boot.builder.SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}

}
