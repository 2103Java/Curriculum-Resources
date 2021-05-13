package com.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Profile("dev")
public class TestController {
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping(value = "/hello",produces = "application/json")
	public String hello() {
		System.out.println("Hello");
		return "Planet Service One is running! We're in port number: " + serverPort;
	}

}
