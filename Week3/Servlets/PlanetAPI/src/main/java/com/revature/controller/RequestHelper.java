package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoHibernate;
import com.revature.service.PlanetService;

public class RequestHelper {
	
	PlanetDao pDao = new PlanetDaoHibernate();
	PlanetService pService = new PlanetService(pDao);
	PlanetController pController = new PlanetController(pService);

	public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


//		System.out.println(request.getRequestURI());
		
		String endpoint = request.getRequestURI();
		String method = request.getMethod(); //Only considering GET, POST, PUT and DELETE
		
		
		
		switch(endpoint) {
			
		case "/PlanetAPI/api/planet":
			System.out.println("Inside Planet logic!");
			
			switch(method) {
			case "GET":
				pController.getPlanet(request,response);
				break;
			case "POST":
				pController.postPlanet(request, response);
				break;
			case "PUT":
				break;
			case "DELETE":
				break;
				
			default: 
				response.setStatus(405);
			}
			break;
			
		case "/PlanetAPI/api/moon":
			System.out.println("Inside Moon logic");
			break;
				
			
		default:
			response.setStatus(418);
		
		}
		
	}

}
