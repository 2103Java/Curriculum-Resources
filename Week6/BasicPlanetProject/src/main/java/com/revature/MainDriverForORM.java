package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.PlanetDao;
import com.revature.models.Planet;

public class MainDriverForORM {
	
	public  static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-annotations.xml");
	
	public static void main(String[] args) {
		
		
		PlanetDao pDao = appContext.getBean("PlanetDao",PlanetDao.class);
//		PlanetDao pDao = appContext.getBean("PlanetDaoBetterBean",PlanetDao.class);
		
		Planet p = new Planet(0,"Earth 1");
		Planet p1 = new Planet(0,"Earth 2");
		Planet p2 = new Planet(0,"Earth 3");
		Planet p3 = new Planet(0,"Earth 4");
		Planet p4 = new Planet(0,"Earth 5");
		Planet p5 = new Planet(0,"Mars");
		pDao.insertPlanet(p1);
		pDao.insertPlanet(p2);
		pDao.insertPlanet(p3);
		pDao.insertPlanet(p4);
		pDao.insertPlanet(p5);
		
		
		System.out.println(pDao.selectAllPlanet());
		
		
	}

}
