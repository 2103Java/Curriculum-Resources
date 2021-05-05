package com.revature.dao;

import java.util.List;

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

	@Override
	public Planet selectPlanetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Planet selectPlanetByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Planet> selectAllPlanet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatePlanet(Planet p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletePlanet(Planet p) {
		// TODO Auto-generated method stub
		return null;
	}

}
