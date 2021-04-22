package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class PlanetDaoHibernate implements PlanetDao {

	@Override
	public Planet getPlanetById(int id) {
		
		Session session = HibernateUtil.getSession();
		
		Planet p = session.get(Planet.class, id);
		
		session.close();
		return p;
	}

	@Override
	public void insertPlanet(Planet p) {

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		session.save(p);
		
		tx.commit();
		session.close();
		
		
	}

	@Override
	public Planet getPlanetByName(String name) {
		
		Session ses = HibernateUtil.getSession();
		
		Planet p = null;
		
		//Native SQL -- assuming 
		p = ses.createNativeQuery("SELECT * FROM planet_table WHERE planet_name = '" + name + "'",Planet.class).list().get(0);
		
		//Hibernate Query Language
		
		//Criteria API 
		
		return p;
	}

	@Override
	public Planet getPlanetsWithBlueInTheDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Planet getPlanetWithRegexDescription(String regex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePlanetMass(int id, double mass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePlanet(Planet p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Planet> getAllPlanets() {

		Session session = HibernateUtil.getSession();
		
		List<Planet> planetList = null;
		
		planetList = session.createQuery("from Planet",Planet.class).list();
		
		return planetList;
	}
	
	

}
