package com.revature.repo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.revature.models.Planet;
import com.revature.util.ConnectionFactory;

public class PlanetDaoImpl implements PlanetDao {

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
	public List<Planet> selectAllPlanets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertPlanet(Planet p) {

		//A connection
		Connection conn = ConnectionFactory.getConnection();
		
		//An insert statement 
		String sql = "INSERT INTO planets(planet_name,atmosphere,volume) values " 
				+ "( '" + p.getName() + "'," + p.isAtmosphere() + "," + p.getVolume() +")";
		
		try {
			Statement s = conn.createStatement();
			
			s.execute(sql);
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean updateVolume(Planet p, double newVolume) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePlanet(Planet p) {
		// TODO Auto-generated method stub
		return false;
	}

}
