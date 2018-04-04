package com.company.InputOutput;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	File file = new File("/Users/milan/Desktop/NewTextFile.txt");

	public File fileCreated() {

		// for windows File file = new File("C:\\newfile.txt");
		boolean b = false;
		try {
			b = file.createNewFile();
		} catch (IOException e) {
			System.out.println("There was an error while creating ");
			

		}
		if (b) {
			System.out.println("New File has been Created ");

		} else {
			System.out.println("File is already exist ");
		}
		return file;
	}

}
