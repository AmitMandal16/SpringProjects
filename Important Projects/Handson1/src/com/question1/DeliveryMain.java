package com.question1;

import java.util.Scanner;

public class DeliveryMain {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the over : ");
		long over= sc.nextLong();
		
		System.out.print("Enter the ball : ");
		long ball = sc.nextLong();	
		
		System.out.print("Enter the runs : ");
		long runs = sc.nextLong();
		
		System.out.println("Enter the batsman name : ");
		String batsman = sc.nextLine();
		
		System.out.println("Enter the bowler name : ");
		String bowler = sc.nextLine();
		
		System.out.println("Enter the nonStriker name : ");
		String nonStriker = sc.nextLine();
		
		Delivery delivery= new Delivery(over, ball, runs, batsman, bowler, nonStriker);
		delivery.displayDeliveryDetails();
		
		sc.close();
	}

}
