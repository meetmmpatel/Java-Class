package com.company.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class MoreExample {
	
	public static void main(String[] args) {
		sampleTestforPOJO();
		
	}
	
	public static void sampleTestforPOJO() {
		
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("Mike", 11, 23));
		arrayList.add(new Student("Peter", 23, 34));
		arrayList.add(new Student("Dave", 12, 32));
		
		System.out.println(arrayList);
		
		
		
		
		
	}

}
