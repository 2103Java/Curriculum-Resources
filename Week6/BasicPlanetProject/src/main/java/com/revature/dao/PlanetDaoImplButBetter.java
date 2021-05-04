package com.revature.dao;

import com.revature.models.Planet;

public class PlanetDaoImplButBetter implements PlanetDao{

	@Override
	public boolean insertPlanet(Planet p) {
		System.out.println("Inside the better implementation");
		return true;
	}

}
