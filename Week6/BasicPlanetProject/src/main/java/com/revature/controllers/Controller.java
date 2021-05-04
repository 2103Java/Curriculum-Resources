package com.revature.controllers;

import com.revature.service.PlanetService;

public class Controller {
	
	private PlanetService pService;
	

	public PlanetService getpService() {
		return pService;
	}

	public void setpService(PlanetService pService) {
		this.pService = pService;
	}
	
	public void sayHelloAgain() {
		this.pService.sayHello();
		System.out.println("Hello from controller!");
	}
	

}
