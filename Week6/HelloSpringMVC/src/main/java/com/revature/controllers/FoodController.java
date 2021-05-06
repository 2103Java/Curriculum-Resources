package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.revature.model.Fruit;

//This is another example of a stereotype. 
//This tells Spring that this "bean" is a controller so it will automatically navigate our url requests to this controller!

@Controller("WeDontNeedToGiveAName")
public class FoodController {
	
	public static List<Fruit> fruitList = new ArrayList<>();
	
//	@RequestMapping(value="/{fruit}")
//	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
//	public @ResponseBody String randomMEthod() {
//		return "The method is not defined";
//	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/fruit/{id}")
	@ResponseStatus(code = HttpStatus.IM_USED)
	public @ResponseBody Fruit getFruit(@PathVariable("id") int id) {
		
		if(fruitList.get(id) != null) {
			return fruitList.get(id);
		}else {
			return new Fruit();
		}
		
		
	}
	
	@PostMapping(value = "/fruit", params= {"id","name"})
	public ResponseEntity<String> postFruit(int id, String name) {
		
		System.out.println(id);
		System.out.println(name);
		fruitList.add(new Fruit(id, name, 0, 0));
		
		System.out.println(fruitList);
		
		
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("favourite colour", "Ultramarine");
		
		return new ResponseEntity<String>(responseHeaders, HttpStatus.I_AM_A_TEAPOT);
		
	}
	
	@PostMapping(value="/fruitByJSON")
	public @ResponseBody String postFruitByJSON(@RequestBody Fruit incomingFruit) {
		fruitList.add(incomingFruit);
		return "success";
	}
	
	
	

}
