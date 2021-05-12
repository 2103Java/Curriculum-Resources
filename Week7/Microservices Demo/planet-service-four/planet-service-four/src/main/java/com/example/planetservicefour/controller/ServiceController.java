package com.example.planetservicefour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.planetservicefour.models.Planet;
import com.example.planetservicefour.repo.PlanetRepository;

@RestController
public class ServiceController {
	
	@Autowired
	PlanetRepository planetRepository;
	
	@GetMapping("/PlanetOneTest")
	public String helloPlanetOne() {
		return planetRepository.whatIsPlanetOneSaying();
	}
	
	@GetMapping("/PlanetTwoTest")
	public List<Planet> helloPlanetTwo() {
		return planetRepository.whatIsPlanetTwoSaying();
	}
	
	@GetMapping("/PlanetThreeTest")
	public List<Planet> helloPlanetThree() {
		return planetRepository.whatIsPlanetThreeSaying();
	}

}
