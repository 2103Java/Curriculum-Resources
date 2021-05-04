package com.revature.servlet;

import com.revature.controllers.Controller;
import com.revature.dao.PlanetDao;

public class MasterServlet {
	
	private Controller controller;
	
	
	
	public MasterServlet() {
		
		
		super();
		System.out.println("Inside no args!");
		// TODO Auto-generated constructor stub
	}
	
	public MasterServlet(Controller controller, PlanetDao pDao) {
		System.out.println("Inside 2 args!");
		this.controller = controller;
	}

	public MasterServlet(Controller controller) {
		System.out.println("Inside 1 args!");
		this.controller = controller;
	}
	
	

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
	
	public void onceMoreHelloButInFrench() {
		controller.sayHelloAgain();
		System.out.println("Hallo");
	}

}
