package com.company.collection.List.Vector;

import java.util.List;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		vectorList();
	}

	static void  vectorList() {
		Vector<Integer> vec = new Vector < Integer > (2);
		vec.addElement((int) 45.56);
		vec.addElement((int) 98.89);
		
		System.out.println(vec);
		System.out.println(vec.size() + " "+ vec.capacity());
		
		
		vec.add(43);
		vec.add(90);
		vec.add(44);
		vec.add(78);
		vec.add(88);
		System.out.println(vec.size() + " After Adding more elements " + vec.capacity());
		
		List ls = vec.subList(2, 5);
		System.out.println(ls);
		
		for (int i = 0; i < ls.size(); i++) {
			System.out.println("SubList of List "+ls.get(i));
		}
		

	}



}
