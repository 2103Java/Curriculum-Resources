package com.example.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.models.Planet;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class PlanetService {
	
	/*
	 * service vs components 
	 * service vs repository 
	 * repository vs components
	 * 
	 * All of these in OUR scope, is basically labels. They don't change the behaviour of our beans significantly. 
	 * What does cause a signficant change is @Controller and @ResController
	 */
	
	/*
	 * My plan is to get the rocky planets - I'm going to do this by grabbing all the planets and then filtering them here. 
	 */
	
	
	private final RestTemplate restTemplate;
	
	public PlanetService(RestTemplate restTemplate) {
		this.restTemplate= restTemplate;
	}
	
	@HystrixCommand(fallbackMethod = "securePlanetMethod")
	public List<Planet> getRockyPlanets(){
		
		URI uri = URI.create("http://localhost:5000/planets");
		
		List<Planet> allThePlanets =  this.restTemplate.getForObject(uri, List.class);
		
		List<Planet> rockyPlanets = allThePlanets;
		
		
		for(Object o: allThePlanets) {
			LinkedHashMap<String, String> a = (LinkedHashMap<String, String>) o;
		
		}
		
//		System.out.println(allThePlanets.get(0).getId());
		
		rockyPlanets.add(new Planet(9, "Pluto", true, 0.05));
		
		return rockyPlanets;
		
	}

	@HystrixCommand(fallbackMethod = "evenMoreReliable")
	public List<Planet> securePlanetMethod(){
		List<Planet> rockyPlanets = new ArrayList<Planet>();
		
		rockyPlanets.add(new Planet(1000, "Good old reliable", true, 1.0));
		
		return rockyPlanets;
	}
	
	public List<Planet> evenMoreReliable(){
		return null;
	}
}
