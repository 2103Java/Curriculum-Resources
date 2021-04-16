package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.models.Planet;

public class DirectResponse extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException{
		
		resp.setContentType("text/html");

		//PW object is used to directly respond to the client
		PrintWriter pw = resp.getWriter();
		
		Planet p  = new Planet("Mars");
		
		pw.write("<h1>Hello There! " + p.getName() + "</h1>");
		
	}

}
