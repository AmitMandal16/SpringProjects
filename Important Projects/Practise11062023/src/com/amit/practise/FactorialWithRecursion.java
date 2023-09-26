package com.amit.practise;

public class FactorialWithRecursion {

	static int fact = 1;

	public static void main(String[] args) {

		int result = factorial(5);

		System.out.println("Factorial = " + result);

	}

	public static int factorial(int n) {
	
		if (n > 1) {

			fact = fact * n;

			factorial(n - 1);

		}

		return fact;
	}
}
