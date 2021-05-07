package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Planet;
import com.example.repo.PlanetDao;

@RestController //RestController assumes you're a RESTful API, so will automatically add @REsponseBody to each return type.
@RequestMapping("/api/planet")
public class PlanetController {
	
	//private PlanetService
	@Autowired
	private PlanetDao planetDao;
	
	public PlanetController(PlanetDao planetDao) {
		this.planetDao = planetDao;
	}
	
	@GetMapping("")
	public List<Planet> getAllPlanets(){
		return planetDao.findAll();
	}
	
	@GetMapping("/ordered")
	public List<Planet> getPlanetButOrdered(){
		return planetDao.findAllByOrderByMassDesc();
	}
	
	@GetMapping("/id/{id}")
	public Planet getPlanetById(@PathVariable int id) {
		return planetDao.findById(id);
		
	}
	
	@GetMapping("/{name}")
	public List<Planet> getPlanetByName(@PathVariable String name) {
		return planetDao.findByName(name);
	}
	
	@PostMapping("/insert") //localhost:9090/api/planet with a POSt 
	public void insertPlanet(@RequestBody Planet p) {
		
		planetDao.save(p);
	
	}
	
	/*
	 * Fetching planets orderd by mass
	 * 
	 * fetching planets over a range!
	 */
	
	@DeleteMapping("/delete/{id}")
	public void deletePlanet(@PathVariable int id) {
		
		planetDao.deleteById(id);
	
	}
	
	

}
