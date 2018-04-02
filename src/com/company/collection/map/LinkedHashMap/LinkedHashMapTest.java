package com.company.collection.map.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {
	
	public static void main(String[] args) {
		linkedHashMap();
	}
	
	public static void linkedHashMap() {
		Map<Integer, String> lhmap = new LinkedHashMap<>();
		lhmap.put(87, "NFL");
		lhmap.put(78, "NHL");
		lhmap.put(23, "NCAA");
		lhmap.put(12, "NBA");
		lhmap.put(44, "NBC");
		
		Set set = lhmap.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey() +" " + me.getValue());
		}
		
	}
	
	

}
