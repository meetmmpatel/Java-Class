package com.company.collection.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListWithLoops {
	public static void main(String[] args) {
		linkedListWithLoops();

	}

	public static void linkedListWithLoops() {
		List<Double> dLink = new LinkedList<>();
		dLink.add(34.56);
		dLink.add(23.90);
		dLink.add(75.75);
		dLink.add(90.7);
		System.out.println(dLink);

		for (int counter = 0; counter < dLink.size(); counter++) {
			System.out.println(dLink.get(counter));
		}
		System.out.println("After For Loop: " + dLink);

		for (double num : dLink) {
			System.out.println("For Each loop: " + num);
		}

		Iterator it = dLink.iterator();
		while (it.hasNext()) {
			System.out.println("Iterator with While loop : " + it.next());
		}
	}

}
