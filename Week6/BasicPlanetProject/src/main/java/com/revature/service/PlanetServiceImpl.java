package com.revature.service;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;

public class PlanetServiceImpl implements PlanetService {
	
	private PlanetDao pDao; 
	
	public PlanetServiceImpl(PlanetDao pDao, String random) {
		this.pDao = pDao;
	}
	
	public PlanetServiceImpl() {

	}

	public PlanetDao getpDao() {
		return pDao;
	}



	public void setpDao(PlanetDao pDao) {
		this.pDao = pDao;
	}



	@Override
	public void sayHello() {


		if(this.pDao.insertPlanet(new Planet())) {
			System.out.println("Hello!");
		}
		
	}

}
