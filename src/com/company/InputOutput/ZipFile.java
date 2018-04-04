package com.company.InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {

	public void zipFileCovert() {
		try {
			File file = new File ("/Users/milan/Desktop/TextFile.txt");
			String zipfileName = file.getName().concat(".zip");
			
			FileOutputStream fos = new FileOutputStream(zipfileName);
			ZipOutputStream zip = new ZipOutputStream(fos);
			
			zip.putNextEntry(new ZipEntry(file.getName()));
			
			byte[] bytes = Files.readAllBytes(Paths.get("/Users/milan/Desktop/TextFile.txt"));
			zip.write(bytes,0,bytes.length);
			zip.closeEntry();
			zip.close();
			System.out.println("File is zipped");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			
		}
		catch(IOException ex) {
			System.out.println("I/O Error");
			
		}

	}
}
