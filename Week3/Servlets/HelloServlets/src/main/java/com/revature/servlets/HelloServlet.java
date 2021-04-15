package com.revature.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class HelloServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("hi!");
		
	}

	
	
	/*
	 *	What is a servlet? 
	 *		Is just a class, that allows us to handle requests and responses 
	 *
	 * 	It extends the capability of our server. 
	 * 
	 * 	Servlet Container (Web container) handle's the lifecycle of a servlet (Tomcat Apache)
	 * 
	 * 	We need servlet libraries in our project!
	 */

}
