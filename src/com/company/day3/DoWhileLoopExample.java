package com.company.day3;

public class DoWhileLoopExample {
	
	public static void main(String[] args) {
		
		int i = -1;
		
		do {
			System.out.println(i);
			i--;
		}while(i > 0);
		
		int arr[] = {1,3,5,67,79};
		int num = 0;
		
		do {
			System.out.println(arr[num]);
			num++;
		}while(num < arr.length);
		
		
		
	}
	

}
