package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("SessionController")
@RequestMapping("/security")
public class SessionController {
	
	
	@PostMapping(value = "/login", params= {"username"})
	public @ResponseBody String getSession(HttpServletRequest request, String username) {
		
		String response = "";
		HttpSession session = request.getSession(false);
		if(username.equals("Bob")) {
			session.setAttribute("access", true);
			response = "Welcome Bob";
		}else {
			session.setAttribute("access", false);
			response = "You're not Bob";
		}
		
		
		/*
		 * We heend a HttpRequest
		 */
		
		return response;
		
	}
	
	
	@GetMapping(value="/checkSession")
	public  String checkSession(HttpSession session) {
		//Spring is doing : HttpSession = request.getSession(true);
		
		String response = "";
		
		if(session != null) {
			
			Object sessionAttribute = session.getAttribute("access");
			
			if(sessionAttribute != null) {
				
				Boolean allowedAccess = (Boolean) sessionAttribute;
				if(allowedAccess) {
					response = "User has access";
				}else {
					response = "User does not have access";
				}
				
			}else {
				response = "Brand new session, create a proper one!";
			}
			
		}else {
			System.out.println("Get a session!");
		}
		
		
		return "Index";
	}

}
