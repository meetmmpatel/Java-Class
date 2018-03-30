package com.company.day2;

public class IfElseIFCondition {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 20;
		int num3 = 70;
		
		if ((num1 >= num2) && (num1 >= num3)) {
			System.out.println(num1 + "it's num1 number");
		}
		else if (num2 >= num1 && num2>= num3) {
			System.out.println(num2 + "It's num 2 numbers");
		}else {
			System.out.println(num3 + "it's number 3");
		}
		
				

		

	}

}
