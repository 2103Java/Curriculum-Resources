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
	
	private static final String URL = "jdbc:postgresql://database-1.cqoseij0k35s.us-east-2.rds.amazonaws.com/postgres";
	private static final String USERNAME = "planet_user";
	private static final String PASSWORD = "p4ssw0rd";
	
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
