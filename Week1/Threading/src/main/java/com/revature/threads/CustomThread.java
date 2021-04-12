package com.revature.threads;

public class CustomThread extends Thread{
	
//	@Override
//	public void start() {
//		
//		super.start();
//		
//	}
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("Hi!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
