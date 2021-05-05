package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;

//@Component("MoonServiceImpl")
public class MoonServiceImpl implements PlanetService {
	
//	@Autowired
	private PlanetDao pDao;

	@Override
	public void sayHello() {
		pDao.insertPlanet(new Planet());

	}

}
