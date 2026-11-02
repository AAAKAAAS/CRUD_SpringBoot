package com.example.CRUDSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class DemoApplication {

	 static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.print("Hello World");
	}

}
