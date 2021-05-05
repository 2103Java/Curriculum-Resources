package com.revature.dao;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	/*
	 * Method that is being implemeted, that we access the repository 
	 * 
	 * CRUD operations
	 */
	
	//CREATE
	public Boolean insertPlanet(Planet p);
	
	
	//READ
	public Planet selectPlanetById(int id);
	public Planet selectPlanetByName(String name);
	public List<Planet> selectAllPlanet();
	
	//UPDATE
	public Boolean updatePlanet(Planet p);
	
	//DELETE
	public Boolean deletePlanet(Planet p);
	

}
