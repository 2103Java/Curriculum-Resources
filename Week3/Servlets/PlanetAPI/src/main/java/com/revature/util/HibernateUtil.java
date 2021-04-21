package com.revature.util;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.revature.models.Planet;

public class HibernateUtil {
	
	private static SessionFactory sf = getSessionFactory();
//	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	public static SessionFactory getSessionFactory() {
		if(sf == null) {
			Configuration configuration = new Configuration();
			
			Properties settings = new Properties();
			
			//Database configuration
			settings.put(Environment.DRIVER, "org.postgresql.Driver");
			settings.put(Environment.URL, "jdbc:postgresql://database-1.cqoseij0k35s.us-east-2.rds.amazonaws.com/postgres");
			settings.put(Environment.USER, "postgres");
			settings.put(Environment.PASS, System.getenv("TRAINING_DB_PASSWORD"));
			settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
			
			//Hibernate configruation
			settings.put(Environment.SHOW_SQL, "true");
			
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			
			settings.put(Environment.HBM2DDL_AUTO, "validate");
			
			configuration.setProperties(settings);
			
			configuration.addAnnotatedClass(Planet.class);
			
			ServiceRegistry sR = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			sf = configuration.buildSessionFactory(sR);
			
		}
		return sf;
	}
	
	

	
	
	public static Session getSession() {
		return sf.openSession();
	}

}
