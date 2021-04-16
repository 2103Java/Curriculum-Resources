package com.revature.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Forwarding extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws IOException, ServletException{
		
		//We need a RequestDispatcher to forward
		// We can't forward to external resources. 
		
		RequestDispatcher redir = req.getRequestDispatcher("/Welcome.html");
		
//		RequestDispatcher redir = req.getRequestDispatcher("/redirect");
		
		redir.forward(req, resp);
		
		
		
	}

}
