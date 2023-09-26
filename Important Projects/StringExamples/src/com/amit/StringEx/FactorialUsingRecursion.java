package com.amit.StringEx;

public class FactorialUsingRecursion {

	static int fact = 1;

	public static void main(String[] args) {

		FactorialUsingRecursion f = new FactorialUsingRecursion();

		int result = f.factorial(5);

		System.out.println(result);

	}

	public int factorial(int n) {

		if (n > 1) {

			fact = fact * n;

			factorial(n - 1);

		}
		return fact;
	}
}
