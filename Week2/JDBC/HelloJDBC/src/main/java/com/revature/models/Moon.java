package com.revature.models;

public class Moon {
	
	private int id;
	private String name;
	private Planet myPlanet;
	
	
	
	public Moon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Moon(int id, String name, Planet myPlanet) {
		super();
		this.id = id;
		this.name = name;
		this.myPlanet = myPlanet;
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
	public Planet getMyPlanet() {
		return myPlanet;
	}
	public void setMyPlanet(Planet myPlanet) {
		this.myPlanet = myPlanet;
	}
	@Override
	public String toString() {
		return "Moon [id=" + id + ", name=" + name + ", myPlanet=" + myPlanet.getName() + "]";
	}
	
	

}
