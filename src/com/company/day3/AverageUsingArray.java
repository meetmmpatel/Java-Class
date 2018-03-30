package com.company.day3;

public class AverageUsingArray {
	
	
	public static void main(String[] args) {
		
		double[] arr = {12, 34.89, 16.5, 200};
		
		double total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		
		System.out.println(total);
		
		double avg = total / arr.length;
		
		System.out.println("The avg is : "+ avg);
		
		
	}

}
