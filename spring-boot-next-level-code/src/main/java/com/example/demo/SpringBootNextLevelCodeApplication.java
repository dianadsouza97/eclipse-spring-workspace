package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing
@SpringBootApplication
public class SpringBootNextLevelCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNextLevelCodeApplication.class, args);
	}

}
