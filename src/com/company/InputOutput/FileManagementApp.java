package com.company.InputOutput;

import java.io.IOException;

public class FileManagementApp {
	public static void main(String[] args) {
		FileCreation();
		write();
		read();

	}

	public static void FileCreation() {
		CreateFile cFile = new CreateFile();
		cFile.fileCreated();

	}

	public static void write() {
		WriteFile wr = new WriteFile();
		wr.fileWriter();
	}
	
	public static void read() {
		ReadFile read = new ReadFile();
		try {
			read.readFile();
		} catch (IOException e) {
			System.out.println("No file found to read");
			e.printStackTrace();
		}
	}
	
	

}
