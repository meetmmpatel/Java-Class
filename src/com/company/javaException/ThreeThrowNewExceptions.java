package com.company.javaException;

public class ThreeThrowNewExceptions {
	public static void main(String[] args) {
		checkEligibility(34, 88);
		
	}
	
	
	public static void checkEligibility(int age, int hight) {
		if (age <= 18 && hight >= 72) {
			throw new ArithmeticException("Age or Hight is not appropriate");
		}
		else {
			System.out.println("Let's join them");
		}
		
	}

}
