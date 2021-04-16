package com.revature.dao;

import com.revature.models.Planet;

public interface PlanetDao {

	Planet getPlanetById(int id);
	
	public boolean insertPlanet(Planet p);

}
