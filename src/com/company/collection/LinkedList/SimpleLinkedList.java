package com.company.collection.LinkedList;

import java.util.LinkedList;

public class SimpleLinkedList {
	
	public static void main(String[] args) {
		linkedList();
		
	}
	
	public static void linkedList() {
		LinkedList<String> link = new LinkedList<>();
		link.add("DC");
		link.add("New York");
		link.add("Boston");
		link.add("Baltimore");
		
		System.out.println("Full City list: "+link);
		
		link.addFirst("Chicago");
		link.addLast("Houston");
		
		System.out.println("After  adding city: " + link);
		
	}

}
