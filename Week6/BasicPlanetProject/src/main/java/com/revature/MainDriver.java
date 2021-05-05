package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Moon;
import com.revature.models.Planet;



public class MainDriver {
	
	/*
	 * What is Spring Boot?
	 * 		Like a really.... straight forward to make servlet and rest api.
	 * 		A framework in which we could in which the handling of the rest is VERY EASY. using annotations. get annotation.
	 * 		A lot of annotations. 
	 * 
	 * 
	 * What is Spring?
	 * 		Spring is a module based, open source, AOP (Aspect oriented programming) framework. 
	 * 			It provides support for enterprise scale applications. 
	 * 			It provides infrastructure so that we can focus on the business logic. 
	 * 
	 * What are modules in Spring?
	 * 		Core, Context, ORM, AOP, Security, Tests, Beans, etc....
	 * 		(These modules look a lot like dependencies)
	 * 
	 * How does Spring achieve it's goals - i.e. what features does Spring have for us?
	 * 
	 * 		IoC Container - Inversion of Control Container 
	 * 		AOP
	 * 		MVC Design patterns
	 * 		A LOT OF ABSTRACTED APIs
	 */

	/*
	 * What is ApplicaitonContext? 
	 * 		It's a child class of BeanFacroty
	 * 
	 * What's a BeanFActory?
	 * 		It makes and manages Beans. 
	 * 
	 * Why don't I use a BeanFactory?
	 * 		Because AppContext has more features and the only the use case for beanfactory is if performance is REALLY REALLY important. 
	 * 
	 * 
	 * ApplicationContext:
	 * 		Is a type of BeanFactory (Is Spring's IoC container)
	 * 
	 * 		BeanFacgtory contains information regarding the beans you have defined in your project. 
	 * 
	 * 		Bean: 
	 * 			Is an object that is instantaited and managed by Spring's container. We are no longer responsible for 
	 * 			creating and managing our objects!
	 */
	
//	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-manual.xml");
//	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-autowire.xml");
	public  static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-annotations.xml");
	
	public static void main(String[] args) {
		
	
//		Configured using beans-manual
//		MasterServlet masterServlet = appContext.getBean("MasterServletSECOND",MasterServlet.class);
//		masterServlet = appContext.getBean("MasterServletSECOND",MasterServlet.class);
//		masterServlet = appContext.getBean("MasterServletFIRST",MasterServlet.class);
//		masterServlet = appContext.getBean("MasterServletSECOND",MasterServlet.class);
//		masterServlet = appContext.getBean("MasterServletFIRST",MasterServlet.class);
//		masterServlet = appContext.getBean("MasterServletFIRST",MasterServlet.class);
//		masterServlet = appContext.getBean("MasterServletFIRST",MasterServlet.class);
		
		
//		masterServlet.onceMoreHelloButInFrench();
//		

		
		//Configured using beans-autowire
		
//		PlanetService pService = appContext.getBean("PlanetServiceFIRST",PlanetService.class);
//		pService.sayHello();
		
//		Controller controller = appContext.getBean("PlanetControllerFIRST",Controller.class);
//		controller.sayHelloAgain();
		
//		MasterServlet mServlet = appContext.getBean("MasterServletSECOND",MasterServlet.class);
//		mServlet.onceMoreHelloButInFrench();
		
		
		//Configured using full annotations
//		PlanetDao pDao = appContext.getBean("PlanetDaoBean",PlanetDao.class);
//
//		pDao.insertPlanet(new Planet());

//		PlanetService pService = appContext.getBean("PlanetServiceImpl",PlanetService.class);
//		
//		pService.sayHello();
		
//		Controller controller = appContext.getBean("controller",Controller.class);
////		
//		controller.sayHelloAgain();
//		
//		controller.anotherMethod(false, 0, null);
		
		System.out.println("Hello!");
		
		
		//Using Lombok 
		
		Planet p = new Planet(0,"Earth");
		
		System.out.println(p.getId());
		p.setName("Mars");
		System.out.println(p.getName());
		System.out.println(p);
		
		Moon m = new Moon(0, null, 0);
	}

}
