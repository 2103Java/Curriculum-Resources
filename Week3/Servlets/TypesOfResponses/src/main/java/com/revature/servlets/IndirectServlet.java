package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndirectServlet extends HttpServlet{
	
	//1) Redirect 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws IOException, ServletException{
		
		
		resp.sendRedirect("http://localhost:9000/TypesOfResponses/Landing");
		
		
	}
	
}
