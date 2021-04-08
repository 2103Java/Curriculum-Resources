package com.revature;

import com.revature.models.Planet;
import com.revature.repo.PlanetDao;
import com.revature.repo.PlanetDaoImpl;

public class MainDriver {

	public static void main(String[] args) {



		PlanetDao pDao  = new PlanetDaoImpl();
		
		Planet p = new Planet(0, "Saturn", true, 40);
		
		pDao.insertPlanet(p);

	}

}
