package com.example;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MainDriver {
	
	/*
	 * 
	 * What is logging?
	 * 		
	 * 		Keeping a record of things that have happened. 
	 * 
	 * Why?
	 * 	
	 * 		Look back and see what's happened. 
	 * 		e.g. If an error happened, what led up to the error. 
	 * 		e.g. What features are customers using a lot. 
	 * 
	 * In our project, we will be using log4j
	 * 
	 * properties I might need to confiugre?
	 * 
	 * 			File location 
	 * 			What sort of information do we want to log? purely informational, or just errors?
	 * 			Layout pattern: Am I keeping track of time and date, keeping track of where it's being invoked. 
	 */

	final static Logger loggy = Logger.getLogger(MainDriver.class);
	
	public static void main(String[] args) {

		loggy.setLevel(Level.ERROR);

		loggy.info("This is an info message!");
		
		loggy.error("Something bad happened!");
		
		loggy.setLevel(Level.WARN);
		
		loggy.info("This is an info message!");
		
		loggy.error("Something bad happened!");
		
		loggy.info("We're doomed!");
		
		/*
		 * info - > warn -> error --> fatal
		 */

	}

}
