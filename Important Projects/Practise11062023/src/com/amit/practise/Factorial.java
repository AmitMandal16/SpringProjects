package com.amit.practise;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n=5, factorial=1;
		
		for(int i = 1; i<=n; i++ ) {
			
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of "+ n+ " = " +factorial);
		
	}

}
