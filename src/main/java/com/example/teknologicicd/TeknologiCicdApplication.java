package com.example.teknologicicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TeknologiCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeknologiCicdApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "der er hul igennem - + 1";
	}
}
