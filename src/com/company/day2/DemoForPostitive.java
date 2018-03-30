package com.company.day2;

import java.util.Scanner;

public class DemoForPostitive {
	public static void main(String[] args) {
		
		int x ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		
		x = scan.nextInt();
		scan.close();
		
		if (x > 0) {
			System.out.println("The number is positive");
		}else if(x < 0) {
			System.out.println("The number is nagative");
		}else {
			System.out.println("The number is not postive or nagative");
		}
		
		
		
		
		
		
	}

}
