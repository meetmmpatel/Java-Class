package com.company.javaException;

public class ThrowExample {
	
	// Student age < 12
	//Student weight < 40
	public static void main(String[] args) {
		checkEligibility(10, 39);
		
	}
	
	static void checkEligibility(int stuage, int stuweight) {
		if(stuage <12 && stuweight < 40) {
			
			throw new ArithmeticException("Student not eleigible");
			
		}
		else {
			System.out.println("Student is eleigble");
		}
		
	}

}
