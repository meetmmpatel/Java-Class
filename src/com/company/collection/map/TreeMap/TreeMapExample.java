package com.company.collection.map.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		treeMapValue();
		
	}
	
	public static void treeMapValue() {
		
		TreeMap<Integer,String> tree = new TreeMap<>();
		tree.put(89, "MAC");
		tree.put(67, "Windows");
		tree.put(23, "ChromeBook");
		tree.put(12, "Linux");
		
		Set set = tree.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey() +" " + me.getValue());
		}
		
		
		
	}
	

}
