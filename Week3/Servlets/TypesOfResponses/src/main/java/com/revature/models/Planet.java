package com.revature.models;

public class Planet {
	
	private int id;
	private String name;
	private double planetMass;
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(int id, String name, double planetMass) {
		super();
		this.id = id;
		this.name = name;
		this.planetMass = planetMass;
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
	public double getPlanetMass() {
		return planetMass;
	}
	public void setPlanetMass(double planetMass) {
		this.planetMass = planetMass;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", planetMass=" + planetMass + "]";
	}
	

	
	

}
