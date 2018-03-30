package com.company.day7;

public class InterfaceSamsungWashingMachine implements InterfaceWashingMachine ,InterfaceWashingMachineMnt {


	
	public static void main(String[] args) {
		InterfaceSamsungWashingMachine samsung = new InterfaceSamsungWashingMachine();
		samsung.startButton();
		samsung.mntWashingMachine();
		
	}

	@Override
	public void mntWashingMachine() {
		// TODO Auto-generated method stub
		
		System.out.println("Please maitanine my wahshing machine");
		
	}
	
	@Override
	public void startButton() {
		// TODO Auto-generated method stub
		
		System.out.println("Start the Machine");
		
	}

}
