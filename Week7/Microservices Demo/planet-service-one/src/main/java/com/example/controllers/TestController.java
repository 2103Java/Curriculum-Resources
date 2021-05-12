package com.example.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Profile("dev")
public class TestController {
	
	@GetMapping(value = "/hello",produces = "application/json")
	public String hello() {
		System.out.println("Hello");
		return "Planet Service One is running!";
	}

}
