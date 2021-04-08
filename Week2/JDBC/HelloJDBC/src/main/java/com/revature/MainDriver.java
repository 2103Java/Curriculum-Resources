package com.revature;

import com.revature.presentation.PlanetPresentation;
import com.revature.repo.MoonDao;
import com.revature.repo.MoonDaoImpl;
import com.revature.repo.PlanetDao;
import com.revature.repo.PlanetDaoImpl;
import com.revature.service.PlanetService;

public class MainDriver {

	public static void main(String[] args) {
		
		PlanetDao pDao = new PlanetDaoImpl();
		MoonDao mDao = new MoonDaoImpl();
		
		PlanetService ps = new PlanetService(pDao,mDao);
		
		PlanetPresentation pPresentation = new PlanetPresentation(ps);
		
		pPresentation.choosePlanet();


		
	}

}
