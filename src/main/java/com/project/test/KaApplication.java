package com.project.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class KaApplication {
	public static void main(String[] args) {
		SpringApplication.run(KaApplication.class, args);
	}

}
