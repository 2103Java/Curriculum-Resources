package com.revature.dao;

import org.springframework.stereotype.Component;

import com.revature.models.Planet;

//This annotation tells Spring that this is a bean!
@Component("PlanetDaoBetterBean")
public class PlanetDaoImplButBetter implements PlanetDao{

	@Override
	public Boolean insertPlanet(Planet p) {
		System.out.println("Inside the better implementation");
		return true;
	}
	
	public void randomMethodAgain(int a, boolean b, String c) {
		
	}

}
