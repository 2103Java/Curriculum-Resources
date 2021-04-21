package com.revature.service;

import java.util.List;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;

public class PlanetService {
	
	private PlanetDao pDao;

	public PlanetService(PlanetDao pDao) {
		this.pDao = pDao;
	}

	public Planet getPlanet(int id) {
	
		Planet p = pDao.getPlanetById(id);
		
		return p;
	}
	
	public List<Planet> getAllPlanets(){
		return pDao.getAllPlanets();
	}
	
	
	public boolean storePlanet(Planet p) {
		pDao.insertPlanet(p);
		
		return true;
	}

}
