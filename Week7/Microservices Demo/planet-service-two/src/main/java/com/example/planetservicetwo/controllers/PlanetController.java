package com.example.planetservicetwo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.planetservicetwo.models.Planet;

@RestController
@RequestMapping("/planets")
public class PlanetController {
	
	/*
	 * What is planet 2 service is doing ?
	 *  	To get the planets!
	 *  	To act as a respository service that exposes the planets to all the other services. 
	 *  	How does it expose it? 
	 *  		Rest API 
	 */
	
	public static List<Planet> getPlanets(){
		List<Planet> planets = new ArrayList<>();
		
		planets.add(new Planet(0,"Earth", true, 0));
		planets.add(new Planet(0,"Mercury", true, 0));
		planets.add(new Planet(0,"Venus", true, 0));
		planets.add(new Planet(0,"Mars", true, 0));
		planets.add(new Planet(0,"Jupiter", false, 0));
		planets.add(new Planet(0,"Saturn", false, 0));
		planets.add(new Planet(0,"Uranus", false, 0));
		planets.add(new Planet(0,"Neptune", false, 0));
		return planets;
	}
	
	@GetMapping("")
	public List<Planet> getSomePlanets(){
		
		return getPlanets();
	}
	


}
