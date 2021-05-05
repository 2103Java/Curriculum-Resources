package com.revature.dao;

import org.springframework.stereotype.Component;

import com.revature.models.Planet;

@Component("pDao")
public class PlanetDaoImpl implements PlanetDao {

	@Override
	public Boolean insertPlanet(Planet p) {
		// TODO Auto-generated method stub
		return (Boolean) true;
	}
	
	public void randomMethod(String random) {
		
	}

}
