package com.example.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planet {
	
	private Integer id;
	private String name;
	private Boolean rocky;
	private Double mass;
	
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public boolean isRocky() {
//		return rocky;
//	}
//	public void setRocky(boolean rocky) {
//		this.rocky = rocky;
//	}
//	public double getMass() {
//		return mass;
//	}
//	public void setMass(double mass) {
//		this.mass = mass;
//	}
//	@Override
//	public String toString() {
//		return "Planet [id=" + id + ", name=" + name + ", rocky=" + rocky + ", mass=" + mass + "]";
//	}
//	
	

}
