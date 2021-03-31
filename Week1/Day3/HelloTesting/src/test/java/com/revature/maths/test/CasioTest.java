package com.revature.maths.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.revature.maths.Abacus;
import com.revature.maths.Casio;

public class CasioTest {
	
	@Mock
	private Abacus a; //fake version of this. Why? Because I'm not testing Abacus, I don't it to be the reason why my Casio fails. 
	
	
	private Casio c; //real version of this - because I'm testing it!
					// Why not a Calculator c? Because I'm testing a Casio, not a calculator. A calculator is an interface. 
	
	/*
	 * What is Mockito?
	 * 		When we have multiple dependencies dependent on each other, we need to isolate them. 
	 * 
	 * 		We create "perfect" copy of each dependency - it will work regardless of how messed up my actual code is. 
	 * 
	 * 		Mockito comes in as an assistant to our JUnit testing framework!
	 */
	
	@Before
	public void setup() {
//		this.a = new Abacus();
		
		a = mock(Abacus.class); //I'm using a static method from mockito to tell it to mock Abacus
		
		//stubbing -- How would you define the following (concisely) ? 
		when(a.basicAdd(2, 3)).thenReturn(5.0);
		when(a.basicAdd(2, 3.07)).thenReturn(5.07);
		
		when(a.divide(0, 0)).thenThrow(ArithmeticException.class);
		
		this.c = new Casio(a);
	}
	
	
	@Test
	public void testAdd() {
		assertEquals(5, c.add(2, 3), 0.01);
		assertEquals(5.07, c.add(2, 3.07), 0.0001);
		
		
	}

}
