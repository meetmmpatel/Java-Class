package com.company.day5;

public class MethodWithLoop {
	
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i ++) {
			int result = getSquare(i);
			System.out.println("Square of " + i + " is " + result);
			
		}
		
		
	}
	
	private static int getSquare (int x ) {
		return x * x;
	}

}
