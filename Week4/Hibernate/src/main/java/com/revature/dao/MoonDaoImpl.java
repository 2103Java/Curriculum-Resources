package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Moon;
import com.revature.util.HibernateUtil;

public class MoonDaoImpl implements MoonDao {

	@Override
	public void insertMoon(Moon m) {
		Session sesh = HibernateUtil.getSession();
		Transaction tx = sesh.beginTransaction();
		
		sesh.save(m);
		
		tx.commit();
//		sesh.close(); We have a global session now!

	}

}
