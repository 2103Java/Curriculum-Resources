package com.revature.maths;

public class Abacus {
	
	
	public double basicAdd(double x, double y) {
		return x +y + 2;
		
	}
	
	public double divide(double x, double y) {
		
		if(y == 0) {
			throw new ArithmeticException();
		}
		return  x/y;
	}

}
