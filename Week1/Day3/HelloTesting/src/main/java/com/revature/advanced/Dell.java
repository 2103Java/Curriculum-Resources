package com.revature.advanced;

import com.revature.maths.Calculator;

public class Dell implements Computer {
	
	private Calculator c;
	
	public Dell(Calculator c) {
		//scopes 
		this.c = c;
	}

	@Override
	public double fancyAddition(double x, double y, double z) {
		
		double initalSum = c.add(x, y);
		initalSum = c.add(initalSum, z);
		
		return initalSum;
	}
	
	void fancyMethod() {
		
	}

}
