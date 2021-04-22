package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.FeatureDao;
import com.revature.dao.FeatureDaoImpl;
import com.revature.dao.MoonDao;
import com.revature.dao.MoonDaoImpl;
import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoImpl;
import com.revature.models.Feature;
import com.revature.models.Moon;
import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class MainDriver {
	
	private static PlanetDao pDao = new PlanetDaoImpl();
	private static MoonDao mDao = new MoonDaoImpl();
	private static FeatureDao fDao = new FeatureDaoImpl();
	
	public static void insertInitialValues() {
		
		Planet mercury = new Planet(0,"Mercury",null);
		Planet venus = new Planet(0, "Venus",null);
		Planet earth = new Planet(0,"Earth",null);
		Planet mars = new Planet(0, "Mars",null);
		Planet jupiter = new Planet(0,"Jupiter",null);
		
		Moon theMoon = new Moon(0, "The Moon", earth);
		Moon pheobe = new Moon(0, "Pheobe", mars);
		Moon deimos = new Moon(0,"Deimos",mars);
		
		Feature mountains = new Feature(0,"Mountains");
		Feature oceans = new Feature(0,"Oceans");
		
		
		Moon m1 = new Moon(0,"Jup's moon 1", jupiter);
		Moon m2 = new Moon(0,"Jup's moon 2", jupiter);
		Moon m3 = new Moon(0,"Jup's moon 3", jupiter);
		Moon m4 = new Moon(0,"Jup's moon 4", jupiter);
		
		List<Moon> moonsOfEarth = new ArrayList<>();
		List<Moon> moonsOfMars = new ArrayList<>();
		List<Moon> moonsOfJupiter = new ArrayList<>();
		
		List<Feature> featuresOfEarth = new ArrayList<>();
		List<Feature> featuresOfMars = new ArrayList<>();
		
		featuresOfEarth.add(mountains);
		featuresOfEarth.add(oceans);
		
		featuresOfMars.add(mountains);
		
		earth.setPlanetFeatures(featuresOfEarth);
		mars.setPlanetFeatures(featuresOfMars);
		
		moonsOfEarth.add(theMoon);
		moonsOfMars.add(deimos);
		moonsOfMars.add(pheobe);
		
		moonsOfJupiter.add(m1);
		moonsOfJupiter.add(m2);
		moonsOfJupiter.add(m3);
		moonsOfJupiter.add(m4);
		
		
		
		mDao.insertMoon(m1);
		mDao.insertMoon(m2);
		mDao.insertMoon(m3);
		mDao.insertMoon(m4);
		mDao.insertMoon(theMoon);
		mDao.insertMoon(pheobe);
		mDao.insertMoon(deimos);
		
		pDao.insertPlanet(mercury);
		pDao.insertPlanet(venus);
		pDao.insertPlanet(earth);
		pDao.insertPlanet(mars);
		pDao.insertPlanet(jupiter);
		
		fDao.insertFeature(mountains);
		fDao.insertFeature(oceans);
		
	}
	
	

	public static void main(String[] args) {

		insertInitialValues();
		
		Planet fromTheDatabase = pDao.getPlanetById(pDao.getPlanetsByName("Earth").get(0).getId());
//		HibernateUtil.destroySessionFactory();
//		
		System.out.println(fromTheDatabase.getPlanetFeatures());
		
//		for(Planet p: pDao.getAllPlanet()) {
//			System.out.println(p);
//		}
		
		
		
		HibernateUtil.doneWithSession();

	}

}
