package com.company.javaException;

public class OneTryCatchBlockExample {

	/*
	 * 
	 * Syntax of try catch in java
	 * 
	 * try { //statements that may cause an exception } catch (exception(type)
	 * e(object))‏ { //error handling code }
	 * 
	 * create class, assign main method and one static method for
	 * arithmeticException;
	 * 
	 */

	public static void main(String[] args) {
		singleTryCatch();
		multipleTryCatch();

	}

	public static void singleTryCatch() {
		int num1;
		int num2;

		try {

			num1 = 2;
			num2 = 50 / num1;

			System.out.println(num2);
			System.out.println("This is the try block");

		} catch (ArithmeticException e) {

			System.out.println("Pleae do not divide numbers with zero");

		}

		System.out.println("This is the end of try catch block");

	}

	public static void multipleTryCatch() {
		try {
			int[] arr = { 3, 5, 78, 98,78 };
			for (int i = 0; i < 6; i++) {
				System.out.println(arr[i]);

				 int num3 = 60/0;
			}

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array index out of bound error");

		} catch (ArithmeticException e2) {
			System.out.println("Arithmatic exception");

		} catch (Exception e3) {
			System.out.println("an exception");

		}

		System.out.println("This is the end of multiple try-catch block");

	}

}
