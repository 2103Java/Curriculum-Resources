package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Planet;


public interface PlanetDao extends CrudRepository<Planet, Integer>{
	
	public List<Planet> findByName(String name);
	public Planet findById(int id);
	
	public List<Planet> findAllByOrderByMassDesc();
	
	public List<Planet> findAll();
	
////	
//	public void addPlanet(Planet p);
//	
//	public void deletePlanetById();
	
	
	

}
