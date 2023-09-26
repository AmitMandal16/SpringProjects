package com.amit.autowiring;

public class State {

	private int pin;
	private String stName;

	public State() {
		
		System.out.println("State default const invoked..");

	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		System.out.println("State setter pin method invoked..");
		this.pin = pin;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
		
		System.out.println("State setter method invoked..");
	}

}
