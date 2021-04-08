package com.revature.service;

import com.revature.models.Planet;
import com.revature.repo.MoonDao;
import com.revature.repo.PlanetDao;


public class PlanetService {
	
	PlanetDao pDao;
	MoonDao mDao;
	
	
	public PlanetService(PlanetDao pDao, MoonDao mDao) {
		this.pDao = pDao;
		this.mDao = mDao;
	}


	public Planet getPlanet(String name) {
		
		Planet p = null;
		
		try {
			p = pDao.selectPlanetByName(name);
			
			p.setMoonList(mDao.selectMoonsByPlanet(p));
		} catch(NullPointerException e) {
			p = new Planet(0,"Does not Exist",false,0);
		}
		
		
		
		
		return p;

	}

}
