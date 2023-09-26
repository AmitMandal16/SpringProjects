package com.question1;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the player name : ");
		
		String name= sc.nextLine();
		
		System.out.print("Enter the country name : ");
		
		String country = sc.nextLine();
		
		System.out.print("Enter the skill : ");
		
		String skill= sc.nextLine();
		
		System.out.println("\nPlayer Details : \n\nPlayer Name : " +name+ "\nCountry Name : "+country+ 
				"\nSkill : " +skill);
		
		sc.close();
		
		
	}

}
