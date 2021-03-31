package com.revature.maths.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.revature.maths.Abacus;

public class AbacusTest {
	
	 @Rule
     public ExpectedException thrown = ExpectedException.none();
	
	 private Abacus a;
	 
	 @BeforeClass
	 public static void trueSetup() {
		 System.out.println("Setup for setup!");
	 }
	 
	 @AfterClass
	 public static void done() {
		 System.out.println("TEsts are finished");
	 }
	 
	 @Before
	 public void setup() {
		 
		 System.out.println("Setting up Abacus!");
		 System.out.println("---------------------------");
		 a = new Abacus();
	 }
	 
	 @After
	 public void reset() {
		 a = null;
		 System.out.println("--------------------------");
		 System.out.println("REsetting Abacus");
	 }
	
	
	//We use annotations to provide meta data to the JVM
	//e.g. Override, to tell it that the following method is inherited!
	
	//Now we want to tell it that this is a testing method
	
	@Test
	public void testBasicAdd() {
		
		assertEquals(3, a.basicAdd(1, 2),0.00001);
		assertEquals(5, a.basicAdd(2, 3),0.00001);
		assertEquals(7, a.basicAdd(3, 4),0.00001);
		assertEquals(7, a.basicAdd(4, 3),0.00001);
		
		if(a.basicAdd(2, 1) == 3) {
			assertTrue(true);
		}
		
		System.out.println("Testing add method!");
		
	}
	
	@Test
	public void testDivide() {
	
		
		assertEquals(10, a.divide(10, 1), 0.0001);
		assertEquals(1, a.divide(1, 1), 0.0001);
		assertEquals(16, a.divide(32, 2), 0.0001);
		assertEquals(31, a.divide(155, 5), 0.0001);
		
		System.out.println("Divide method being tested!");
		thrown.expect(ArithmeticException.class);
		a.divide(0, 0);
		
		
		
	}

}
