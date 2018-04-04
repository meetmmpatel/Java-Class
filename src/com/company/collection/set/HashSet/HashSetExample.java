package com.company.collection.set.HashSet;

import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		hashTable();
		
		
	}
	
	public static void hashTable() {
		HashSet<String> hset = new HashSet<>();
		hset.add("AA");
		hset.add("BB");
		hset.add("CC");
		hset.add("DD");
		hset.add(null);
		hset.add(null);
		
		System.out.println(hset);
		
		
	}
	

}
