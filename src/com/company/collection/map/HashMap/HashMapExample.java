package com.company.collection.map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		hashMapTest();

	}

	public static void hashMapTest() {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();

		hMap.put(2, "VA");
		hMap.put(34, "MA");
		hMap.put(4, "NY");
		hMap.put(78, "KY");
		hMap.put(89, "NC");

		System.out.println("Index of 78 is " + hMap.get(78));
		System.out.println("=====================");
		System.out.println("Size of hMap is " + hMap.size());
		System.out.println("=====================");
		System.out.println("Is Map empty: " + hMap.isEmpty());
		System.out.println("=====================");
		System.out.println("Is Key Exits: " + hMap.containsKey(89));
		System.out.println("=====================");
		System.out.println("Is Value Exits: " + hMap.containsValue("MA"));
		System.out.println("=====================");
		System.out.println("When we remove key 34 " + hMap.remove(34));
		System.out.println("=====================");

		Set set = hMap.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry mEntry = (Map.Entry) it.next();
			System.out.println("Key is " + mEntry.getKey() + " Value is: ");
			System.out.println(mEntry.getValue());
		}

	}
}
