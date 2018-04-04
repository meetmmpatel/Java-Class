package com.company.InputOutput;

import java.io.FileNotFoundException;

public class FileManagementApp {
	public static void main(String[] args) {
		FileCreation();
		write();
		read();
		appendFile();
		read();
		renameFile();
		zipTheFile();

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
			read.readFileWithScanner();
		} catch (FileNotFoundException e) {
			System.out.println("No file found to read");
			e.printStackTrace();
		}
	}

	public static void appendFile() {
		AppendToFileExample append = new AppendToFileExample();
		append.apppedFile();

	}

	public static void renameFile() {
		RenameFile rFile = new RenameFile();
		rFile.renamefile();
	}

	public static void zipTheFile() {
		ZipFile zip = new ZipFile();
		zip.zipFileCovert();

	}

}
