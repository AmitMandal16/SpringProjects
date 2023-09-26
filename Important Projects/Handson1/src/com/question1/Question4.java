package com.question1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the player name : ");

		String name = sc.nextLine();

		System.out.print("Enter the country name : ");

		String country = sc.nextLine();

		System.out.print("Enter the skill : ");

		String skill = sc.nextLine();
		
		String details = name+","+country+","+skill;
		
		System.out.println("Player details are : " +details);
		
	    String s[]= details.split(",");	
	    
	    System.out.println("Player Name :  "+s[0]);
	    System.out.println("Country Name : "+s[1]);
	    System.out.println("Skill : "+s[2]);

		sc.close();

	}
	
}
