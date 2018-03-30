package com.company.day2;

import java.util.Scanner;

public class TernaryOprator {
	
	public static void main(String[] args) {
		//variable num1 = (expression) ? value if true : value if false
		
		
		
		int num1,num2,num3;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1 = scan.nextInt();
		System.out.println("Enter Secound Number:");
		num2 = scan.nextInt();
		System.out.println("Enter Secound Number:");
		num3 = scan.nextInt();
		
		int temp = (num1>num2) ? num1: num2;
		int result = (num3 > temp)? num3 : temp;
		
		System.out.println("Largets Number is" + result);
		
	}
	
	
	
	
	

	

}
