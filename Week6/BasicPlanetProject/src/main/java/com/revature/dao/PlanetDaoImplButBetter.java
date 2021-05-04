package com.revature.dao;

import org.springframework.stereotype.Component;

import com.revature.models.Planet;

//This annotation tells Spring that this is a bean!
@Component("PlanetDaoBetterBean")
public class PlanetDaoImplButBetter implements PlanetDao{

	@Override
	public boolean insertPlanet(Planet p) {
		System.out.println("Inside the better implementation");
		return true;
	}

}
