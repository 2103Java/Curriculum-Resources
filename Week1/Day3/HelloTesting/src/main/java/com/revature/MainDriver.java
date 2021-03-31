package com.revature;

import com.revature.advanced.Computer;
import com.revature.advanced.Dell;
import com.revature.advanced.HP;
import com.revature.maths.Abacus;
import com.revature.maths.Calculator;
import com.revature.maths.Casio;
import com.revature.maths.FancyCalculator;
import com.revature.vehicle.Toyota;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * What is testing?
		 * 
		 * 		Ensure our code works 
		 * 		Debugging (finding as much bugs as possible)
		 * 		Need to test before launching
		 * 		Fits Client specifications
		 * 
		 * 
		 * Types of testing?
		 * 	
		 * 		Automation testing 
		 * 		Manual testing
		 * 		Integration testing 
		 * 		Function testing 
		 * 		Unit testing 
		 * 		Regression testing 
		 * 		Stress testing
		 * 		Smoke testing 
		 * 		
		 * 
		 *Unit testing: 
		 *		Testing in isolation, the smallest unit of code. In Java, this is a method. 
		 */
		
		Abacus a = new Abacus();
		
		System.out.println(a.divide(0.0, 0.0));
		
		Calculator c = new Casio(a);
		
		Calculator c2 = new FancyCalculator();
		
		Computer comp = new Dell(c);
		
		Toyota t = new Toyota(c2);
		
		System.out.println(comp.fancyAddition(1, 2, 3));

	}

}
