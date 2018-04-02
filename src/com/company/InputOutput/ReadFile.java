package com.company.InputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	File file = new File("/Users/milan/Desktop/NewTextFile.txt");
	BufferedInputStream br;
	FileInputStream fis;
	
	
	
	public void readFile() throws IOException {
		
		try {
			fis = new FileInputStream(file);
			br = new BufferedInputStream(fis);
			
			while(br.available() > 0) {
				System.out.println((char)br.read());
			}
			
		} catch (FileNotFoundException e1) {
			System.out.println("File not found exception");
			e1.printStackTrace();
		}
		
		
		
		
	}
	

}
