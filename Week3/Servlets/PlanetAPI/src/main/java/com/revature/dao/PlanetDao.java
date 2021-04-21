package com.revature.dao;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {

	
	//READ
	Planet getPlanetById(int id);
	Planet getPlanetByName(String name);
	List<Planet> getAllPlanets();
	
	Planet getPlanetsWithBlueInTheDescription();
	Planet getPlanetWithRegexDescription(String regex);
	
	//CREATE
	public void insertPlanet(Planet p);
	
	//UPDATE
	void updatePlanetMass(int id, double mass);
	
	//DELETE
	void deletePlanet(Planet p);
	
	
	

}
