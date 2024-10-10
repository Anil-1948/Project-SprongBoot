package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sample3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(Sample3Application.class);
		com c=con.getBean(com.class);
		c.m1();
	}

}
