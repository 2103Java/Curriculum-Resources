package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	PlanetService ps;
	
	
	public void testMethod() {
		
	}
	
	@GetMapping(value = "/this")
	public void productionMethoid() {
		
	}

}
