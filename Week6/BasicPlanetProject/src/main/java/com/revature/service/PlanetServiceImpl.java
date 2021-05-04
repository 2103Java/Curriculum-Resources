package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;

@Component("PlanetServiceImpl")
public class PlanetServiceImpl implements PlanetService {
	
	@Autowired
	private PlanetDao pDao; 
	
	public PlanetServiceImpl(PlanetDao pDao, String random) {
		System.out.println("inside 2 args");
		this.pDao = pDao;
	}
	
//	@Autowired
	public PlanetServiceImpl(PlanetDao pDao) {
		System.out.println("inside 1 args");
		this.pDao = pDao;
	}
	

	public PlanetServiceImpl() {
		System.out.println("inside no args");
	}

	public PlanetDao getpDao() {
		return pDao;
	}

	@Override
	public void sayHello() {


		if(this.pDao.insertPlanet(new Planet())) {
			System.out.println("Hello!");
		}
		
	}

}
