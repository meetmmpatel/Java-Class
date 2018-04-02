package com.company.collection.map.HashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortingBy {
	public static void main(String[] args) {
		hashMapSortByKey();

	}

	private static void hashMapSortByKey() {
		Map<Double, String> hmap = new HashMap<Double, String>();
		hmap.put(90.89, "Falls Church");
		hmap.put(78.67, "Mclean");
		hmap.put(56.34, "Reston");
		hmap.put(123.12, "Richmond");

		System.out.println("Before Sorting By Keys ");
		Set set = hmap.entrySet();
		Iterator count = set.iterator();

		while (count.hasNext()) {
			Map.Entry mEntry = (Map.Entry) count.next();
			System.out.println("Keys " + mEntry.getKey() + " Values " + mEntry.getValue());

		}

		Map<Double, String> map = new TreeMap<Double, String>(hmap);
		System.out.println("=====================");
		System.out.println("After Sorting By Keys ");

		Set st = map.entrySet();
		Iterator it = st.iterator();

		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println("Keys " + me.getKey() + " Values " + me.getValue());
		}

	}

}
