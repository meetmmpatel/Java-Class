package com.company.InputOutput;

import java.io.File;

public class RenameFile {
	
	
	public void renamefile() {
		
		File oldFile = new File ("/Users/milan/Desktop/NewTextFile.txt");
		File newfile = new File ("/Users/milan/Desktop/TextFile.txt");
		
		boolean flag = oldFile.renameTo(newfile);
		
		if (flag) {
			System.out.println("File renamed successfully");
			
		}else {
			System.out.println("Not able to rename file");
		}
		
		
		
	}
	
	

}
