package com.example.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferredStream {
	
	public static void main(String[] args) {
		
		String filename = "./src/bufferred.txt"; //relative paths 
		bufferredWrite(filename);
		bufferredRead(filename);
		
	}
	
	public static void bufferredWrite(String filename) {
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
			writer.write("Hello there!\n");
			writer.write("Planet[name = 'bob' , hasRings = 'true']");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void bufferredRead(String filename) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
			
			String line = "";
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
