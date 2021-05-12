package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Planet;
import com.example.service.PlanetService;

@RestController
public class PlanetController {
	
	@Autowired
	PlanetService planetService;
	
	@GetMapping("/planets/rocky")
	public List<Planet> getRockyPlanets(){
		
		List<Planet> rockyPlanets = planetService.getRockyPlanets();
		
		return rockyPlanets;
		
	}

}
