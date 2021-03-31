package com.revature.maths;

public class Casio implements Calculator { // CASIO IS-A Calculator
	
	private Abacus a; // CASIO HAS-A 
	
	public Casio(Abacus a) {
		this.a = a;
	}

	@Override
	public double add(double x, double y) {
		System.out.println("Hello there!");
		return a.basicAdd(x, y);
	}

}
