package com.company.day3;

public class JavaForLoop {

	public static void main(String[] args) {

		for (int j = 0; j < 10; j++) {
			System.out.println(j);

			++j;
		}
		
		int arr[] = {2,4,6,8,10};
		String names[] = {"John","Mike","Smith"};
		
		for(int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int j =0; j<names.length;j++) {
			System.out.println(names[j]);
		}

	}

}
