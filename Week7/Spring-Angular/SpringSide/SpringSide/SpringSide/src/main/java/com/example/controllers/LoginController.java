package com.example.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.models.Message;
import com.example.models.User;

@Controller
@CrossOrigin(origins = {"http://localhost:4200", "https://mybobsessions.s3.us-east-2.amazonaws.com"},  allowCredentials = "true")
public class LoginController {
	
	@GetMapping(value = "/hello")
	public @ResponseBody Message sendMessage() {
		return new Message("heelo!");
	}
	
	@GetMapping(value = "/login")
	public @ResponseBody Message authenticate(HttpSession session) {
		
		User u = new User("Bob",true);
		
		session.setAttribute("user", u);
		

		return new Message("You've logged in!");
	}
	
	@GetMapping(value = "/logout")
	public @ResponseBody Message logout(HttpSession session) {
		

		
		session.invalidate();
		
		return new Message("You've successfully logged out!");
		
	}
	
	@GetMapping(value = "/checkSession")
	public @ResponseBody User verifySessionHasUserAssociatedWithIt(HttpSession session) {
		
		User u = null;
		
		
		if((User) session.getAttribute("user") == null) {
			u = new User("Fakey fake",false);
		}else {
			u = (User) session.getAttribute("user");
		}
		
		return u;
	}
	
	

}
