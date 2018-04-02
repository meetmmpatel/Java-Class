package com.company.javaException;

public class TwoTryCatchFinallyBlock {
	/*
	 *  Syntax for Try Catch and Finally block
		try {
		    //Statements that may cause an exception
		}
		catch (){
		   //Handling exception
		}
		finally {
		   //Statements to be executed
		}
	 * 
	 */
	
	public static void main(String[] args) {
		finallyTry();
		
	}
	
	public static void finallyTry() {
		try {
			int num = 123/1;
			System.out.println(num);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Number should not be devided by zero");
		}
		finally {
			System.out.println("this is fianlly block");
		}
		
		System.out.println("this is outside of try-catch");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
