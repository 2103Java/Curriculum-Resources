package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("HelloController")
@RequestMapping(value = "/greetings")
public class HelloController {
	
	/*
	 * We would need a servlet 
	 * 
	 * Request Helper to specify the controller
	 * 
	 * Controller would levarage our business logic
	 * 
	 * a key value pair and a json object 
	 */
	
	@RequestMapping(value = "/hello")
	public @ResponseBody String greetings() {
		return "ello there!";
	}
	
	@RequestMapping(value = "/bonjour")
	public String greetingsInGreek() {
		return "hallo"; //This will cause it to be forwarded to /mvc/greetings/hello
	}

}
