package com.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${message}")
	private String configMessage;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Holla " + configMessage;
	}

}
