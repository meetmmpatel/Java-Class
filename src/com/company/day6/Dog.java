package com.company.day6;

public class Dog extends Animal{

	@Override
	public void makeNoice() {
		// TODO Auto-generated method stub
		System.out.println("Dog Bark");
		
	}
	
	public void run() {
		System.out.println("Dogs runs");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog Moves");
		
	}
}
