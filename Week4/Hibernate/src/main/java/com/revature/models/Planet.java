package com.revature.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "planet_table")
public class Planet {
	
	@Id
	@Column(name = "planet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "planet_name")
	private String name;
	
	//EAGER means that it will grab the objects straightaway!
	//LAZY will actually return a proxy object 
	//When I refer to the "lazy" variable, then hibernate will secretly go to the database and try to grab the objects. 
	
	@OneToMany(mappedBy = "myPlanet", fetch = FetchType.LAZY) 
	private List<Moon> moons;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Feature> planetFeatures;
	
	

	public Planet(int id, String name, List<Moon> moons, List<Feature> planetFeatures) {
		super();
		this.id = id;
		this.name = name;
		this.moons = moons;
		this.planetFeatures = planetFeatures;
	}

	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Feature> getPlanetFeatures() {
		return planetFeatures;
	}

	public void setPlanetFeatures(List<Feature> planetFeatures) {
		this.planetFeatures = planetFeatures;
	}

	public Planet(int id, String name, List<Moon> moons) {
		super();
		this.id = id;
		this.name = name;
		this.moons = moons;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Moon> getMoons() {
		return moons;
	}

	public void setMoons(List<Moon> moons) {
		this.moons = moons;
	}

	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", moons=" + moons + ", planetFeatures=" + planetFeatures + "]";
	}


	
	
	
	
	

}
