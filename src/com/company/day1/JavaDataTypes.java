package com.company.day1;

import java.util.Scanner;

public class JavaDataTypes {
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		int sum;
		
		String str1 = "10";
		String str2 = "15";
		String sumOfStr = str1 + str2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number" );
		num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		num2 = sc.nextInt();
	
		sc.close();
		
		sum = num1 + num2;
		
		System.out.println(sumOfStr);
		
		System.out.println("OutPut:" + sum);
		
		
		
	
		
		
		
		
		
		
	}
	
	

}
