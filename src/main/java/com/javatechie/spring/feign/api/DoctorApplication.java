package com.javatechie.spring.feign.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoctorApplication {


	@GetMapping("/getDS")
	public String getDoctor() {
        return "Doctor microservice called ...";
    }

	@GetMapping("/welcome/{name}")
	public String wish(@PathVariable String name) {
		return "Hi " + name + " Welcome to Docter microservice";
	}

	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}

}
