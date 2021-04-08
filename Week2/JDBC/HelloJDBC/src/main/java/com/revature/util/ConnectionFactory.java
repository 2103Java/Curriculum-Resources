package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	/*
	 * JDBC - Java Database Connection 
	 * 
	 * JDBC API handles databases using JAva, allows us to interact with our DB via CRUD methods!
	 * 
	 * Important interfaces in JDBC:
	 * 		DriverManager
	 * 		Connection 
	 * 		Statement 
	 * 		PreparedStatement 
	 */
	
	/*
	 * What do we need to connect?
	 * 	Endpoint, username and password 
	 */
	
	private static final String URL = System.getenv("TRAINING_DB_URL");
	private static final String USERNAME = System.getenv("TRAINING_DB_USERNAME");
	private static final String PASSWORD = System.getenv("TRAINING_DB_PASSWORD");
	
	private static Connection conn;
	
	public static Connection getConnection() {
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
