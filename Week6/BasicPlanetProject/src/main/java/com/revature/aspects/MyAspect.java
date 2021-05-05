package com.revature.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.dao.PlanetDao;

@Component("MyAspect")
@Aspect
public class MyAspect {
	
	static int number = 0;
	
	
	
	/*
	 * CCC - Cross Cutting Concerns
	 * 
	 * 		CCC is meta logic that an application needs, it is effectively independent of the business logic. 
	 * 		In other words, logic that most if not every application should have. 
	 * 
	 * Examples:
	 * 		Logging 
	 * 		Exceptions 
	 * 		Caching 
	 * 		Transactions
	 * 		Security 
	 * 		etc....
	 */

	/*
	 * What is an Aspect?
	 * 		A class that stores a collection of advice. 
	 * 
	 * What is an advice?
	 * 		An advice is an action taken by an aspect, in Java it will invoke when a method has been invoked. 
	 * 	
	 * What does an advice look like?
	 * 		It looks like a method.
	 * 
	 * Types of Advice: 
	 * 		@Before
	 * 		@After
	 * 
	 * PointCut: 
	 * 		Are expression that are used to specify particular joinpoints. In otherworeds subsets of joinpoints. 
	 * 
	 * JoinPoint: 
	 * 		JP are all the possible points in the runtime where an advice CAN be invoked!
	 * 		JP take the form of an object injected into an advice by Spring AOP. The object should contain information about 
	 * 			the class and the method itself. 
	 * 
	 * 
	 * Aspects, Advice, Joinpoint, PointCut 
	 */
	
	
	@Before("execution(* *(..))") //PointCut
//	@Before("execution(String *(..))") //targetting all methods that return String
//	@Before("execution(boolean *(..))") //targetting all methods that return boolean 
//	@Before("execution(* *(boolean,..))") ///targetting methods that have arguments beginning with boolean 
	//target methods in com.revature.controllers 
	public void doingMyLogs(JoinPoint jP) {
		
		final Logger loggy = Logger.getLogger(jP.getTarget().getClass());
		
		loggy.info("Before logging and the number of methods that have been invoked are " + number);
	
	}
//	
	@After("execution(* *(..))")
	public void trackingMethodsInvoked() {
		number++;
	}
	
//	@Around("execution(* *(..))")
//	public void veryPowerfulAdvice(ProceedingJoinPoint pjp) throws Throwable {
//		final Logger loggy = Logger.getLogger(pjp.getTarget().getClass());
//		
//		loggy.info("Before logging");
//		
//		
//		/*
//		 * if(security authentication)
//		 * 
//		 * if(permission is allowed)
		
//			if(pjp.getTarget().getClass() == com.revature.dao.PlanetDaomImpl) {
//				loggy.info("Class has been deprecated, being rerouted!");
//				
//				PlanetDao pDao = appContext.getBean("BetterPlanetDaoImpl");
//				
//				switch(whichMEthodWasInvoked):
//					case "insertPlanet":
//						pDao.insertPlanet();
//			}
//		 */
//		
//		pjp.proceed(); // The target method does not exite it's logic
//		
//		/*
//		 * else(method has been depcreated)
//		 * 
//		 * else(rerouting to another class)
//		 */
//		
//		loggy.info("After logging");
//		
//		
//		
//	}
}
