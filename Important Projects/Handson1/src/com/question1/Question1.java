package com.question1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the venue name : ");
		String name= sc.nextLine();
		
		System.out.print("Enter the city name : ");
		String city = sc.nextLine();
		
		System.out.println("\nVenue Details : \nVenue Name : " +name+ "\nCity Name : " +city);
			
		sc.close();
	}
	
}
