package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class PlanetDaoImpl implements PlanetDao {
	
	//Default Crud methods from Hibernate.
	/*
	 * get() and load()
	 * update() and merge()
	 * save() and persist()
	 * delete()
	 * saveOrUpdate() 
	 */

	@Override
	public void insertPlanet(Planet p) {
		
		Session sesh = HibernateUtil.getSession();
		Transaction tx = sesh.beginTransaction();
		
		sesh.save(p);
		
		
		
		tx.commit();
//		sesh.close(); We have a global session now!

	}

	@Override
	public List<Planet> getAllPlanet() {
		List<Planet> planetList = null;
		Session sesh = HibernateUtil.getSession();

		
		//HQL 
		planetList = sesh.createQuery("from Planet",Planet.class).list();
		
		
		planetList = sesh.createQuery("from Planet where name = 'Earth'" ,Planet.class).list();
		
		
//		sesh.close(); We have a global session now!
		
		return planetList;
	}

	@Override
	public List<Planet> getPlanetsByName(String name) {
		
		List<Planet> planetList = null;
		Session sesh = HibernateUtil.getSession();
		
		
		//HQL 
		planetList = sesh.createQuery("from Planet where name = '" + name + "'",Planet.class).list();
		
		//Criteria API - this is deprecated. Criteria builder is more modern, but it's a lot of line of code. 
		planetList = sesh.createCriteria(Planet.class).add(Restrictions.ilike("name", name)).list();
//		sesh.close(); We have a global session now!
		
		return planetList;
	}

	@Override
	public Planet getPlanetById(int id) {
		Session sesh = HibernateUtil.getSession();
		
		Planet p = sesh.get(Planet.class, id);
		
//		sesh.close(); We have a global session now!
		
		return p;
	}

	@Override
	public void updatePlanet(Planet p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePlanet(Planet p) {
		// TODO Auto-generated method stub

	}

}
