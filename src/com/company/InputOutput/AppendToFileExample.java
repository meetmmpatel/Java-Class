package com.company.InputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {

	FileWriter fw;
	BufferedWriter bw;
	File file = null;

	public void apppedFile() {
		try {

			file = new File("/Users/milan/Desktop/NewTextFile.txt");
			String data = "this is new content we want to add";
			fw = new FileWriter(file.getAbsolutePath(), true);
			bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();

			System.out.println("Done appeding file");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error while file appeding");

		}

	}

}
