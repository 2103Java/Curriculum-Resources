package com.revature.repo;

import java.util.List;

import com.revature.models.Moon;
import com.revature.models.Planet;

public interface MoonDao {
	
	List<Moon> selectMoonsByPlanet(Planet p);

}
