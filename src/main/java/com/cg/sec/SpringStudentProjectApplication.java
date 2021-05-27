package com.cg.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringStudentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentProjectApplication.class, args);
	}

}
