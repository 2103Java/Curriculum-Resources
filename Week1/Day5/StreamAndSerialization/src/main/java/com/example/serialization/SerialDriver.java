package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialDriver {
	
	public static void main(String[] args) {
		
		String filename = "./myParrot.txt";
		String filename2 = "./myEagle.txt";
		String filename3 = "./myBirds.txt";
		
		Bird parrot = new Bird("Sheila", "Parrot", 2.0);
		Bird eagle = new Bird("Bobby", "Eagle", 5.5);

		List<Bird> birdList = new ArrayList<>();
		birdList.add(eagle);
		birdList.add(parrot);
		
		
//		writeObject(filename,parrot);
//		writeObject(filename2,eagle);
		
//		Bird WrittenParrot = readObject(filename);
//		
//		System.out.println(WrittenParrot);

		writeObject(filename3, birdList);
		List<Bird> birdListFromFile = readObjectList(filename3);
		
		System.out.println(birdListFromFile);
	}

	private static Bird readObject(String filename) {
		
		Object obj = null;
		Bird p = null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			
			obj = ois.readObject();
			p = (Bird) obj;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	private static List<Bird> readObjectList(String filename){
		

		Object obj = null;
		List<Bird> p = null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			
			obj = ois.readObject();
			p = (List<Bird>) obj;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
		
		
	}
	
	private static void writeObject(String filename, Bird parrot) {


		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			
			oos.writeObject(parrot);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeObject(String filename, List<Bird> birdList) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			
			oos.writeObject(birdList);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}