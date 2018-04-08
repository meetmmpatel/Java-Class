package com.company.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GenericsApp {

	public static void main(String[] args) {

		pureGenric();
		getUnionSetValues();

	}

	public static void pureGenric() {
		PureGenericsClass<Integer, String> pg = new PureGenericsClass<Integer, String>(12, "DC");
		int num = pg.getItem1();
		String str = pg.getItem2();

		System.out.println(num);
		System.out.println(str);

		PureGenericsClass<String, String> pg2 = new PureGenericsClass<String, String>("Key", "Value");
		String str2 = pg2.getItem1();
		String str3 = pg2.getItem2();

		System.out.println(str2 + " " + str3);

	}

	// Sample of Genetics Methods
	public static <E> Set<E> unionOfSets(Set<E> set1, Set<E> set2) {

		Set<E> results = new HashSet<>();
		results.addAll(set2);

		return results;

	}

	public static void getUnionSetValues() {
		Set<String> mySet1 = new HashSet<>();
		mySet1.add("DC");
		mySet1.add("VA");
		mySet1.add("MD");

		Set<String> mySet2 = new TreeSet<>();
		mySet2.add("DC");
		mySet2.add("VA");
		mySet2.add("MD");
		mySet2.add("PA");

		Set<String> resultSet = unionOfSets(mySet1, mySet2);

		Iterator<String> it = resultSet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
