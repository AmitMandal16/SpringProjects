package com.practise.amit;

public class Test {



	public static Float calculateCost(int distance, int mileage, float cost) {
		
	
		return ((distance/mileage)*cost)*30;
	}
	
	public static void main(String[] args) {
		
		float totalCost= Test.calculateCost(100, 20, 30);
		
		System.out.println(totalCost);
		
	}
}
