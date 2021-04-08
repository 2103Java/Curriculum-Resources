package com.revature.repo;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	/*
	 * DAO - Data Access Object 
	 * 
	 * Design pattern to abstract away the process of interacting with our database 
	 */
	
	//How do I want my Java code to interact with my database
	
	//SELECT/READ statments 
	Planet selectPlanetById(int id);
	Planet selectPlanetByName(String name);
	List<Planet> selectAllPlanets();

	
	// INSERT/CREATE 
	boolean insertPlanet(Planet p);
	
	//UPDATE
	boolean updateVolume(Planet p, double newVolume);
	
	//DELETE
	boolean deletePlanet(Planet p);
	
	
}
