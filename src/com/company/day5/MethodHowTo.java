package com.company.day5;

public class MethodHowTo {
	
	static int a = 10;
	static int b = 5;
	public static void main(String[] args) {
		
		myMethod();
		myInt();
		System.out.println(square());
		
	}
	
	private static void myMethod() {
		System.out.println("Printing my method");
	}
	
	public static void myInt() {
		
		
		System.out.println(a * b);
	}
	
	static int square() {
		
		return 10 + 10;
	}
	
	

}
