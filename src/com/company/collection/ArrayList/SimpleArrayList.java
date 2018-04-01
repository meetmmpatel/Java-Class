package com.company.collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayList {

	public static void main(String[] args) {

		ArrayListExample();
	}

	public static void ArrayListExample() {

		ArrayList<String> arrList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		arrList.add("Mike");
		arrList.add("Meg");
		arrList.add("Victor");
		arrList.add("Jack");
		System.out.println(arrList);

		System.out.println("Enter a name: ");
		arrList.add(scan.nextLine());

		arrList.remove(0);
		System.out.println(arrList);

		arrList.remove("Meg");
		System.out.println(arrList);
		
		System.out.println("Enter another names: ");

		arrList.add(2, scan.nextLine());
		System.out.println(arrList);

		arrList.set(0, "Josh");
		System.out.println(arrList);

		scan.close();

	}

}
