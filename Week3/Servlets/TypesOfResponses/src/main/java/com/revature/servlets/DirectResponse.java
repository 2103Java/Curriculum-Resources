package com.revature.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Planet;

public class DirectResponse extends HttpServlet{
	
	private static List<Planet> planetList = new ArrayList<>();
	
	private static Planet p = new Planet(1,"Mars",10.0);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException{
		
		resp.setContentType("application/json");

		//PW object is used to directly respond to the client
		// This is used to write out html files.
//		PrintWriter pw = resp.getWriter();
//		
//		p  = new Planet(1,"Mars",10.0);
//		
//		pw.write("<h1>Hello There! " + p.getName() + "</h1>");
		
		
		ObjectMapper om = new ObjectMapper();
		
		resp.getWriter().write(om.writeValueAsString(planetList));
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException{
		
		//using to create my planet to a brand new planet!
		
		ObjectMapper om = new ObjectMapper();
		
		Planet p = om.readValue(req.getReader(), com.revature.models.Planet.class);
		
		planetList.add(p);
		
		resp.setStatus(204);
		
	}
	
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException{
		
		//using to update my planet to a brand new planet!
		
		ObjectMapper om = new ObjectMapper();
		
		p = om.readValue(req.getReader(), com.revature.models.Planet.class);
		
		resp.setStatus(204);
		
	}
	

}
