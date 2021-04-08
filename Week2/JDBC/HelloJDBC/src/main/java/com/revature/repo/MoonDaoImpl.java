package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.revature.models.Moon;
import com.revature.models.Planet;
import com.revature.util.ConnectionFactory;

public class MoonDaoImpl implements MoonDao {

	@Override
	public List<Moon> selectMoonsByPlanet(Planet p) {
		
		String sql = "SELECT * FROM moons WHERE fk_planet_id = (?)";
		
		List<Moon> sqlMoons = new LinkedList<>();
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, p.getId());
			
			ResultSet rs = ps.executeQuery();
			
			
			
			while(rs.next()) {
				sqlMoons.add(new Moon(
						rs.getInt("moon_id"),
						rs.getString("moon_name"),
						p
						));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sqlMoons;
	}

}
