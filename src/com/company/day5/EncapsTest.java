package com.company.day5;

public class EncapsTest {
	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setEmpName("Peter");
		ed.setEmpAge(32);
		ed.setSsn(4567);
		
		EncapsulationDemo ed2 = new EncapsulationDemo();
		
		
		System.out.println(ed.getEmpName());
		System.out.println(ed.getEmpAge());
		System.out.println(ed.getSsn());
		
		
		
	}
	

}
