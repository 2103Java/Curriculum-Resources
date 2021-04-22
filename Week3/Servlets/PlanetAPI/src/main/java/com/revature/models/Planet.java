package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * JPA Annotations (Java Persistence API)
 * 
 * It is a standardized api that deals with mapping java objects to records. 
 * 
 * Hibernate has it's own annotations but it also implements JPA. 
 * 
 * We choose JPA over Hibernate because it makes our project more modular
 */

@Entity //This tells Hibernate that this is something to be persisted. 
@Table(name = "planet_table")
public class Planet {
	
	@Id
	@Column(name = "planet_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "planet_name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "planet_description")
	private String description;
	
	@Column(name = "planet_mass")
	private double mass;
	
	

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public Planet(int id, String name, String description, double mass) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.mass = mass;
	}

	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", description=" + description + ", mass=" + mass + "]";
	}

	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
