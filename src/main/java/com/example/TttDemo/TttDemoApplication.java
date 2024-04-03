package com.example.TttDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "others")
public class TttDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TttDemoApplication.class, args);
	}

}
