package com.revature;

import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoHibernate;
import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class MainDriver {

	public static void main(String[] args) {
		
		HibernateUtil.getSession();
		
		PlanetDao pDao = new PlanetDaoHibernate();
		
		pDao.insertPlanet(new Planet(12, "Earth", "",1));
		pDao.insertPlanet(new Planet(12, "Mars", "",1));
		pDao.insertPlanet(new Planet(12, "Jupiter","",1));
		pDao.insertPlanet(new Planet(12, "Earth 2.0", "",1));
		pDao.insertPlanet(new Planet(12, "Venus", "",1));
		pDao.insertPlanet(new Planet(12, "Pluto", "",1));
		
		System.out.println(pDao.getPlanetByName("Venus"));

	}

}
