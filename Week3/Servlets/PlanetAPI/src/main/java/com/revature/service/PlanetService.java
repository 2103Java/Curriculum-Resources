package com.revature.service;

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
	
	
	public boolean storePlanet(Planet p) {
		pDao.insertPlanet(p);
		
		return true;
	}

}
