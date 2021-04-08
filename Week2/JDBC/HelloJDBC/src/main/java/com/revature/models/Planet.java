package com.revature.models;

import java.util.List;

public class Planet {
	
	private int id;
	private String name;
	private boolean atmosphere;
	private double volume;
	private List<Moon> moonList;
	
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Planet(int id, String name, boolean atmosphere, double volume) {
		super();
		this.id = id;
		this.name = name;
		this.atmosphere = atmosphere;
		this.volume = volume;
	}
	
	public Planet(int id, String name, boolean atmosphere, double volume, List<Moon> moonList) {
		super();
		this.id = id;
		this.name = name;
		this.atmosphere = atmosphere;
		this.volume = volume;
		this.moonList = moonList;
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
	public boolean isAtmosphere() {
		return atmosphere;
	}
	public void setAtmosphere(boolean atmosphere) {
		this.atmosphere = atmosphere;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public List<Moon> getMoonList() {
		return moonList;
	}
	public void setMoonList(List<Moon> moonList) {
		this.moonList = moonList;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", atmosphere=" + atmosphere + ", volume=" + volume
				+ ", moonList=" + moonList + "]";
	}
	
	
	
	
	

}
