package com.example.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	
	public static void main(String[] args) {
		
		String filename = "./byteExample.txt";
		
		writeByStream(filename);
		
//		readByStream(filename);
	
	}
	
	
	public static void readByStream(String filename) {
		
	}
	
	public static void writeByStream(String filename) {
		 
		try(FileOutputStream outs = new FileOutputStream(filename)){
			
			byte[] b = {'a','b','c'};
			
			outs.write(b);
//			outs.write('b');
//			outs.write('b');
//			outs.write('c');
//			outs.write('d');
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
