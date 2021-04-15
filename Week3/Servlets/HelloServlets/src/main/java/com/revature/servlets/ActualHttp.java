package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActualHttp extends HttpServlet{
	
	// HttpServlet is an abstract class 
	// All the methods are concrete 
	
	//Servlet(I) -> GenericServlet (AC) -> HttpServlet (AC)
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		super.service(req, res);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		
		System.out.println("Inside GEt method!!!");
		
//		resp.sendRedirect("index.html");
		
		resp.sendRedirect("advanced/superSpecial.html");
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}

}
