package com.company.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListWithLoops {

	/*
	 * For Loop Advanced for loop While Loop Iterator Enumeration
	 */

	static ArrayList<Integer> arrList = new ArrayList<Integer>();

	public static void main(String[] args) {
		sampleLoops();

	}

	public static void sampleLoops() {

		arrList.add(12);
		arrList.add(34);
		arrList.add(54);
		arrList.add(68);
		arrList.add(44);

		for (int counter = 0; counter < arrList.size(); counter++) {
			System.out.println("Simple For Loop: " + arrList.get(counter));

		}

		for (int count : arrList) {
			System.out.println("For Each loop: " + count);
		}

		int num = 0;
		while (arrList.size() > num) {
			System.out.println("While loop: " + arrList.get(num));
			num++;
		}

		System.out.println("Iterator");

		Iterator in = arrList.iterator();

		while (in.hasNext()) {
			System.out.println("Iterator: " + in.next());
		}

		Enumeration<Integer> e = Collections.enumeration(arrList);
		while (e.hasMoreElements()) {
			System.out.println("With Enumeration: " + e.nextElement());
		}

	}

}
