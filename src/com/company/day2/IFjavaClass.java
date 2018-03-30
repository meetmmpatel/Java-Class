package com.company.day2;

public class IFjavaClass {

	public static void main(String[] args) {

		int num = 70;

		if (!(num == 10)) {
			System.out.println("This number is no same as 70");
			if (num < 65) {
				System.out.println("number is greater or less than num");
			}
		}

		if (num < 71) {
			System.out.println("This is IF only ");
			if (num < 67) {
				System.out.println("Print If");
			}
		} else {
			System.out.println("This is else");
		}

	}

}
