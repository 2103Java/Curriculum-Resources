package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Planet;
import com.revature.service.PlanetService;

public class PlanetController {
	
	private PlanetService pService;

	public PlanetController(PlanetService pService) {
		this.pService = pService;
	}

	public void getPlanet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		
		Planet p = null;
		
		response.setContentType("json/application");
		
		
			int id = Integer.parseInt(request.getParameter("planetId"));
			
			p = pService.getPlanet(id);
			
			ObjectMapper om = new ObjectMapper();
			
			response.setStatus(200);
			
			response.getWriter().write(om.writeValueAsString(p));
			
		
		
		
		
		
	}

	public void postPlanet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		
		ObjectMapper om = new ObjectMapper();
		
		Planet p = om.readValue(request.getReader(), com.revature.models.Planet.class);
		
		pService.storePlanet(p);
		
		response.setStatus(201);
		
	}
}
