package com.example.serialization;

import java.io.Serializable;

public class Bird implements Serializable{  //Marker Interface - tells the JVM that this can be serialized!
	
	
	/*
	 * This is a serail ID. 
	 */
	private static final long serialVersionUID = 652583329724848658L;
	
	private String name;
	private String species;
	private double weight;
	
	
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bird(String name, String species, double weight) {
		super();
		this.name = name;
		this.species = species;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Bird [name=" + name + ", species=" + species + ", weight=" + weight + "]";
	}
	
	

}
