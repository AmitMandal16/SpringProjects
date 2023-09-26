package com.amit.practise;

public class MaxArrayandMinArray {

	public static void main(String[] args) {

		int[] arr = { 4, 6, 8, 2, 3, 9, 8 };

		// System.out.println( arr.length);

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (max <= arr[i]) {

				max = arr[i];

			}

		}

		System.out.println("Maximum Array -> " + max);

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (min >= arr[i]) {

				min = arr[i];

			}

		}
		
		System.out.println("Minimum Array -> " + min);

	}

}
