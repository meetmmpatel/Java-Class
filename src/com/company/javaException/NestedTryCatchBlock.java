package com.company.javaException;

public class NestedTryCatchBlock {
	
	public static void main(String[] args) {
		nestedTryCatch();
		nestedTwiceTryCatch();
		
	}
	
	public static void nestedTryCatch() {
		try {
			try {
				try {
					int arr [] = {23,24,56,67};
					System.out.println(arr[6]);
					
				} catch (ArithmeticException e1) {
					System.out.println("Handled in last Try catch");
				}
				
			} catch (ArrayIndexOutOfBoundsException e2) {
				 System.out.println("Handled in secoud Try catch block");
			}
			
		} catch (Exception e) {
			System.out.println("this is first try Catch block");
		}
	}
	
	public static void nestedTwiceTryCatch() {
		try{
	    	//Child try block1
	         try{
	            System.out.println("Inside block1");
	            int b =45/0;
	            System.out.println(b);
	         }
	         catch(ArithmeticException e1){
	            System.out.println("Exception: e1");
	         }
	         //Child try block2
	         try{
	            System.out.println("Inside block2");
	            int b =45/0;
	            System.out.println(b);
	         }
	         catch(ArrayIndexOutOfBoundsException e2){
	            System.out.println("Exception: e2");
	         }
	        System.out.println("Just other statement");
	    }
	    catch(ArithmeticException e3){
	    	 System.out.println("Arithmetic Exception");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4){
	    	System.out.println("ArrayIndexOutOfBoundsException");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(Exception e5){
	    	System.out.println("Exception");
	         System.out.println("Inside parent try catch block");
	    }
	    System.out.println("Next statement..");
		
	}

}
