package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.service.PlanetService;

@Component("controller")
public class Controller {
	
	@Autowired
	private PlanetService pService;
	
	
	
	


	public Controller(PlanetService pService) {
		this.pService = pService;
	}
	
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}
	

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
	
	public String anotherMethod(Boolean a,Integer b, String c) {
		return "0";
	}
	

}
