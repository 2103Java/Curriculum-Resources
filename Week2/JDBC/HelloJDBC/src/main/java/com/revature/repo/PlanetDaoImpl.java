package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		
		Planet sqlPlanet = null;
		
		;
		
		String sql = "SELECT * FROM planets WHERE planet_name = (?)";
		
		// Prepared statments ensure that we don't get sql injection. 
		
		try(Connection conn = ConnectionFactory.getConnection()) { //try with resource try(){} 
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				sqlPlanet = new Planet(
							rs.getInt(1),
							rs.getString(2),
							rs.getBoolean("atmosphere"),
							rs.getDouble("volume")
						);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sqlPlanet;
	}

	@Override
	public List<Planet> selectAllPlanets() {
		
		return null;
	}

	@Override
	public boolean insertPlanet(Planet p) {

//		//A connection
//		Connection conn = ConnectionFactory.getConnection();
//		
//		//An insert statement 
//		String sql = "INSERT INTO planets(planet_name,atmosphere,volume) values " 
//				+ "( '" + p.getName() + "'," + p.isAtmosphere() + "," + p.getVolume() +")";
//		
//		
//		try {
//			Statement s = conn.createStatement();
//			
//			s.execute(sql);
//			
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			String sql = "INSERT INTO planets(planet_name,atmosphere,volume) values = (?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, p.getName());
			ps.setBoolean(2, p.isAtmosphere());
			ps.setDouble(3, p.getVolume());
			
			ps.execute();
			
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
