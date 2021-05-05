package com.revature.dao;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Planet;

/*
 * Stereotype is a type bean that Spring manages for us. 
 * 
 * We've been using the most "general" type of stereotype, which is the component
 */

@Repository("PlanetDao")
@Transactional
public class PlanetDaoImpl implements PlanetDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
//	@Transactional
	public Boolean insertPlanet(Planet p) {
	
//		Session ses = sessionFactory.openSession();
//		Transaction tx = ses.beginTransaction();
//		System.out.println("Inserting!");
//		ses.save(p);
//		
//		tx.commit();
//		ses.close();
		
		sessionFactory.getCurrentSession().save(p);
		
		return true;
	}
	
	public void randomMethod(String random) {
		
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
