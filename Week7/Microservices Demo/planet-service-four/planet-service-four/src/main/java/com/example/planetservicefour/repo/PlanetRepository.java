package com.example.planetservicefour.repo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.planetservicefour.models.Planet;

@Repository
public class PlanetRepository {
	
	/*
	 * What did my previous dao layers need?
	 * 	They needed connection, Hibernate, 
	 * 
	 * private SessionFactory sessionFActory; --> This was responsible for connecting to our database and back. 
	 */
	
	//Instead we use the exposed RESTFUL API THAT planet-service-two has 
	@Autowired 
	RestTemplate restTemplate; //This will be used to communicate with our other REST based APIs 
	
	public String whatIsPlanetOneSaying() {
		URI uri = URI.create("http://localhost:5000/test/hello");
		
		String planetOneResponse = restTemplate.getForObject(uri, String.class);
		
		return planetOneResponse;
		
		
	}
	
	public List<Planet> whatIsPlanetTwoSaying(){
		
		URI uri = URI.create("http://localhost:5000/planets");
		
		List<Planet> planets = restTemplate.getForObject(uri, List.class);
		
		System.out.println(planets);
		
		return planets;
	}
	
	public List<Planet> whatIsPlanetThreeSaying(){
		
		URI uri = URI.create("http://localhost:5000/planets/rocky");
		
		List<Planet> planets = restTemplate.getForObject(uri, List.class);
		
		System.out.println(planets);
		
		return planets;
		
	}

}
