package com.revature;

import java.util.List;

import com.example.mystructures.lists.ListAndQAbstract;
import com.example.mystructures.lists.MyListAndQ;


public class MainDriver {
	
	public static void main(String[] args) {
		
		
		ListAndQAbstract<String> ls = new MyListAndQ<String>("Hello","Bonjour","Hi");
		
		List<String> newList = null;
		
//		for(String l: newList) {
//			
//		}
		
		for(String l: ls) {
			
		}
		
		System.out.println(ls);
		
	}

}
