package com.example.planetservicetwo.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planet {
	
	private int id;
	private String name;
	private boolean rocky;
	private double mass;
	
	

}
