package com.company.javaException;

public class ExamplesOfExceptions {

	public static void main(String[] args) {

		arithmeticException(45, 0);
		arrayIndexOutOfBounds(36);
		numberFormat("XYZ");
		stringIndexOutOfBound(45);
		nullPointer(null);

	}

	public static void arithmeticException(int num1, int num2) {

		try {
			int numSum = num1 / num2;
			System.out.println(numSum);

		} catch (ArithmeticException e) {
			System.out.println("Do not devide numbers with zero");
		}

	}

	public static void arrayIndexOutOfBounds(int num3) {
		try {

			int[] arr = new int[5];

			arr[num3] = 9;

			System.out.println(arr);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
		}

	}

	public static void numberFormat(String str) {
		try {
			int number = Integer.parseInt(str);
			System.out.println(number);

		} catch (NumberFormatException e) {
			System.out.println("This String can not be coverted to numbers");

		}
	}

	public static void stringIndexOutOfBound(int num4) {

		try {

			String str1 = "JavaForBeginners";
			System.out.println("String length is " + str1.length());
			
			str1.charAt(num4);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index is out of bound");
		}

	}

	public static void nullPointer(String str3) {
		try {

			String str2 = str3;
			System.out.println(str2.length());


		} catch (NullPointerException e) {
			System.out.println("String gets null pointer");

		}

	}

}
