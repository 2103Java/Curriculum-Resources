package com.revature.controllers;

import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping(value="/nextpage")
	public String nextPage() throws IOException {
//		return "Index.html";
//		return "/Index.html";
//		return "/html/super/nested/folder/OtherPage.html";
//		return "Index"; //abstracts away the process of forwarding to our resources in the project. 
		
//		response.sendRedirect("https://www.google.com");
		
		/*
		 * We will need a response 
		 */
		
		return "redirect: https://www.google.com";
	}
	

}
