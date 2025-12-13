package com.example.StartingWithSpring.Starting.with.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class StartingWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartingWithSpringApplication.class, args);

	}

}
