package com.amit.practise;

public class PrimeNo {

	public static void main(String[] args) {

		int n = 9;

		int temp = 0;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				temp = temp + 1;
			}

		}
		
		if(temp == 1) {
			System.out.println("It is a prime No.");
		}
		
		else
			System.out.println("It is not a prime No.");

	}

}
