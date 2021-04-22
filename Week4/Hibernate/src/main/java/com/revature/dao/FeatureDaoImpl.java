package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Feature;
import com.revature.util.HibernateUtil;

public class FeatureDaoImpl implements FeatureDao {

	@Override
	public void insertFeature(Feature f) {
		Session sesh = HibernateUtil.getSession();
		Transaction tx = sesh.beginTransaction();
		
		sesh.save(f);
		
		tx.commit();
//		sesh.close(); We have a global session now!


	}

}
