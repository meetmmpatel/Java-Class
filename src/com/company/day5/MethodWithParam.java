package com.company.day5;

public class MethodWithParam {
	
	public static void main(String[] args) {
		int result;
		int n;
		
		n = 3;
		result = square(n);
		System.out.println("Value of N square is " + result);
		
		n = 4;
		result = square(n);
		System.out.println("Value of N square is " + result);
		 ConstructorExample cont = new ConstructorExample();
	        cont.setName("Milan");
		
		
	}
	
	public static int square(int i) {
		return i * i;
	}
	
	

}
