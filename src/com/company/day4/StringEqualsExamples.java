package com.company.day4;

public class StringEqualsExamples {
	public static void main(String[] args) {
		
		String str1 = new String ("Hello");
		String str2 = new String ("Hi");
		String str3 = new String ("HELLO");
		
		String str = new String("quick brown fox jumps over the lazy dog");
		
		System.out.println(str.length()/2);
		System.out.println(str.substring(19));
		System.out.println(str.substring(10, 25));
		System.out.println(str.indexOf("brown"));
		
		// "This-is-a-String" using String.join.
		String msg = String.join("*", "This","is","a","String");
		System.out.println(msg);
		
		String str6 = "   How are you  ";
		System.out.println(str6.trim());
		
		
		String [] arr = {"Mike", "Majic", "Peter"};
		String names = String.join("|", arr);
		System.out.println(names);
		
		
		System.out.println(str1.toUpperCase().equals(str3));
		
	     System.out.println(str1.equalsIgnoreCase(str3));
	     
	     System.out.println(str3.toLowerCase());
		
	}
	
	
	/*
	 * 	str1 equals to str2:false
		str1 equals to str3:true
		str1 equals to Welcome:false
		str1 equals to Hello:true
		str1 equals to hello:false
	 */
	
	
	
	

}
