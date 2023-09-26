package com.amit.practise;

public class ArmstrongNo {

	public static void main(String[] args) {

		// 153= 1^3 + 5^3 + 3^3
		// if LHS = RHS it will a Armstrong number.

		int n = 153;
		int t1 = n;
		int length = 0;

		while (t1 != 0) { // this is to find the length of the number

			length = length + 1;

			t1 = t1 / 10;

		}
		
		System.out.println("Length of the no ->  " +length);

		int t2 = n;
		int rem = 0;

		int armstrong = 0;

		while (t2 != 0) {

			int multiply = 1;

			rem = t2 % 10; // this is to find the last digit

			for (int i = 0; i < length; i++) { // this is for power multiplication

				multiply = multiply * rem;

			}

			armstrong = armstrong + multiply;

			t2 = t2 / 10;
         
		}
		System.out.println("Armstrong no -> "+ armstrong);
		
		System.out.println(armstrong == n ? " It is a Armstrong No.. " : "It is not Armstrong No..");

	}
}
