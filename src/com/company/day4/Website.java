package com.company.day4;

import java.util.Scanner;

public class Website {
	
	String webName = "cde.com";
	int webAge = 2;
	
	Website(String webName, int webAge) {
		
		this.webName = webName;
		this.webAge = webAge;
	}
	
	public static void main(String[] args) {
		
		Website web1 = new Website("Abc.com", 5);
		Website web2 = new Website("Amazone.com", 15);
		
		System.out.println(web1.webName +  "  " + web1.webAge);
		System.out.println(web2.webName +  "  " + web2.webAge);
		System.out.println();
		
	}

	
	
	
	

}
