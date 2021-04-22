package com.revature.dao;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	//CRUD
	
	//Create
	void insertPlanet(Planet p);
	
	//Read
	List<Planet> getAllPlanet();
	List<Planet> getPlanetsByName(String name);
	Planet getPlanetById(int id);
	
	//Update
	void updatePlanet(Planet p);
	
	//Delete
	void deletePlanet(Planet p);

}
