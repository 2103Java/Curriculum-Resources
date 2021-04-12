package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.threads.CustomRunnable;
import com.revature.threads.CustomThread;

public class MainDriver {
	
	public static List<Integer> listOfNumbers = new ArrayList<>();
	
	//garbage collector is an example of daemon thread. 

	
	// thread lifecycle 
	// New 
	// Runnable 
	// Running 
	// Non-runnable/Waiting/Timed Waiting (blocked)
	// Terminated 
	
	public static void main(String[] args) {
		
		
		Thread producer = new Thread(() ->{
			
			while(true) {
				listOfNumbers.add(2);
			}
			
		});
		
		Thread consumer = new Thread(() ->{
			
			while(true) {
				listOfNumbers.remove(2);
			}
			
		});
		
		producer.start();
		consumer.start();
		
		
		
		
		
		
		
		
//		//// {
//		creating a new CustomThread class 
//		Thread t = new CustomThread();
//		
//		t.start();
//		
//		//// Creating a custom runnable and passing it into my thread class
//		Thread t2 = new Thread(new CustomRunnable());
//	
//		t2.start();
//		
//		//// lamba expressions!
//		Thread t3 = new Thread(() -> {
//			while(true) {
//				System.out.println("Hallo");
//				
//				System.out.println(Thread.currentThread());
//				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
//		
//		t3.start();
//		
////		while(true) {
////			
////			System.out.println("Hello!");
////			
////			Thread.currentThread();
////		}
//		
//		
//		//Common Multi-Threading problems
//		// Concurrent Modification -- synchronisation keyword/synchronised objects (Vector)
//		// Deadlock 
//		// Livelock 
//		// Producer Consumer problem 

	}

}
