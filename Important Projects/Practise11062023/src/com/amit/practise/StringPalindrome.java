package com.amit.practise;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please enter the String to check palindrome -> ");
		
		String a= sc.next();
		
		String rev= "";
		
		for(int i= a.length()-1; i>=0;i--) {
			
			rev= rev+ a.charAt(i);
			
		}
		
		System.out.println("Reversed String -> " +rev);
		
		if(rev.equalsIgnoreCase(a)) {
			
			System.out.println("It is a Palindrome");
			
		}
		
		else {
			
			System.out.println("It is not a Palindrome");
			
		}
		
		sc.close();
		
		
	}
}
