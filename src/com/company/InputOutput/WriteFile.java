package com.company.InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	FileOutputStream fo = null;
	String myContent = "This is Sample test for How to write using java code";
	File file = null;

	public void fileWriter() {

		file = new File("/Users/milan/Desktop/NewTextFile.txt");

			try {
				fo = new FileOutputStream(file);
			} catch (FileNotFoundException e) {
				System.out.println("Print File Exception Found");
				e.printStackTrace();
			}

		byte[] bArray = myContent.getBytes();

		try {
			fo.write(bArray);
			fo.flush();
			System.out.println("File writen sucessfully");
		} catch (IOException e) {
			System.out.println("Error occured during file writing");
			e.printStackTrace();
		}

	}

}
