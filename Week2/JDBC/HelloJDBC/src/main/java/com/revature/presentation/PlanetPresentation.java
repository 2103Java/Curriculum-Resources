package com.revature.presentation;

import java.util.Scanner;

import com.revature.models.Planet;
import com.revature.service.PlanetService;

public class PlanetPresentation {
	
	PlanetService ps;
	
	public PlanetPresentation(PlanetService ps) {
		this.ps = ps;
	}

	public void choosePlanet() {
		
		System.out.println("What planet would you like?");
		
		Scanner sc = new Scanner(System.in);
		
		String planetName = sc.nextLine();
		
		Planet p = ps.getPlanet(planetName);
		
		System.out.println("Here's your planet");
		
		System.out.println(p);

	}

}
