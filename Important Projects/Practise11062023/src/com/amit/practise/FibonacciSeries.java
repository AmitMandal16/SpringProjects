package com.amit.practise;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the no -> ");
		int n = sc.nextInt();

		int a = 0, b = 1;

		System.out.print(a + " , " + b);

		int c = 0;

		for (int i = 0; i < n; i++) {

			c = a + b;
			System.out.print(" , " + c);
			a = b;
			b = c;

		}

		sc.close();
	}

}
