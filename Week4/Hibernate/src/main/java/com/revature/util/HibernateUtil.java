package com.revature.util;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.revature.models.Feature;
import com.revature.models.Moon;
import com.revature.models.Planet;

public class HibernateUtil {
	
	/*
	 * What have we used in Hibernate?
	 * 
	 * 		Configuration
	 * 			Parses our configuration into our session f
	 * 
	 * 		SessionFactory 
	 * 			It creates sessions and stores information on HOW to connect to our database. 
	 * 
	 * 		Session 
	 * 			Manages our connection to the database. 
	 * 			CRUD operations. 
	 * 
	 * 		Transactions
	 * 			Transaction...well...manage our transacitons. 
	 * 
	 * 			ACID:
	 * 				Atomicity 
	 * 				Consistency 
	 * 				Isolation
	 * 				Durability 
	 * 
	 * 		HQL Queries 
	 * 
	 * 		Annotations: 
	 * 			fetchstrategy = eager, lazy 
	 * 			table 
	 * 			entity 
	 * 			id
	 * 			column( nullable , unique)
	 * 			GeneratedValue
	 * 	
	 * 		POJO* 
	 * 
	 * 		
	 * 			
	 * 
	 */
	
	
	private static SessionFactory sf = getSessionFactory();
//	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	public static SessionFactory getSessionFactory() {
		if(sf == null) {
			Configuration configuration = new Configuration();
			
			Properties settings = new Properties();
			
			//Database configuration
			settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://database-3.cqoseij0k35s.us-east-2.rds.amazonaws.com:3306/HibernatePlanet");
			settings.put(Environment.USER, "admin");
			settings.put(Environment.PASS, "p4ssw0rd");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			
			//Hibernate configruation
			settings.put(Environment.SHOW_SQL, "false");
			settings.put(Environment.FORMAT_SQL, "false");
			
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			
			settings.put(Environment.HBM2DDL_AUTO, "create");
			
			configuration.setProperties(settings);
			
			configuration.addAnnotatedClass(Planet.class);
			configuration.addAnnotatedClass(Moon.class);
			configuration.addAnnotatedClass(Feature.class);
			
			ServiceRegistry sR = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			sf = configuration.buildSessionFactory(sR);
			
		}
		return sf;
	}
	
	

	//Our global session object!
	private static Session sesh;
	

	public static Session getSession() {
		if(sesh == null) {
			sesh = sf.openSession();
		}
		return sesh;
	}
	
	public static void doneWithSession() {
		sesh.close();
		sesh = null;
		sf.close();
	}

}
