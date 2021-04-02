package com.example.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	
	public static void main(String[] args) {
		
		String filename = "./charExample.txt";
		
		writeCharacterStream(filename);
		
		readCharacterStream(filename);
	}
	
	
	private static void readCharacterStream(String filename) {
		
		FileReader reader = null;
		
		try {
			reader = new FileReader(filename);
			
			int i;
			
			while((i = reader.read()) != -1) {
				System.out.print((char) i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	private static void writeCharacterStream(String filename) {
		
		FileWriter writer = null;
		
		char[] greetings = {'h','e','l','l','o'};
		
		
		try {
			writer = new FileWriter(filename, true);  //dangerous operation, true = appending over existing info
														// false = overwriting!
			
			for(int i = 0; i < greetings.length; i++) {
				writer.write(greetings[i]);
			}
			
			
			
		} catch( FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
