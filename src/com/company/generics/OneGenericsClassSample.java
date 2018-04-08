package com.company.generics;

import java.util.ArrayList;

public class OneGenericsClassSample {
	public static void main(String[] args) {
		getGenerics();

		getObjects(23);
		getObjects("hey");
	}

	public static void getGenerics() {
		
		//Without genetics values 
		ArrayList arr = new ArrayList();
		arr.add("Add String");
		arr.add(12);
		arr.add(false);
		System.out.println(arr);
		
		String str = (String) arr.get(0);
		System.out.println(str);

	}
	
	
	public static Object getObjects(Object item1) {
		System.out.println(item1);
		return item1;
		
		
		
		
		
	}

}
