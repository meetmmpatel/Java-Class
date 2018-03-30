package com.company.day5;

public class ConstructorExample {
	private int age ;
	private String name;
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

	ConstructorExample(String n, int a){
		this.name = n;
		this.age= a;
	}
	
	
	
	ConstructorExample(){
		this.name = "Mike";
		this.age = 45;
	}
	
	public static void main(String[] args) {
		
		ConstructorExample cont = new ConstructorExample();
		System.out.println(cont.name);
		
		ConstructorExample cont1 = new ConstructorExample("Steve", 34);
		cont1.name = "Steve";
		System.out.println(cont1.name);
	}
	
	public static void getNames(int num, int num2) {
		int sum = num + num2;
		
	}
	
	
	

}
