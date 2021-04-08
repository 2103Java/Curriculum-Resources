package com.revature;

import com.revature.models.Planet;
import com.revature.repo.PlanetDao;
import com.revature.repo.PlanetDaoImpl;

public class MainDriver {

	public static void main(String[] args) {



		PlanetDao pDao  = new PlanetDaoImpl();
		
		
		Planet p = pDao.selectPlanetByName("Earth");
		
		System.out.println(p);

	}

}
