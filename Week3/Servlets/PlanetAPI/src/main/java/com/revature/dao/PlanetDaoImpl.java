package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Planet;

public class PlanetDaoImpl implements PlanetDao {
	
	public static List<Planet> planetList = new ArrayList<>();

	
	//Hardcoding in all the data 
	
	@Override
	public Planet getPlanetById(int id) {
		// TODO Auto-generated method stub
		return planetList.get(id);
	}
	
	public boolean insertPlanet(Planet p) {
		planetList.add(p);
		return true;
	}

}
