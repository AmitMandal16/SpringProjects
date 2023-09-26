package com.amit.StringEx;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter a no to check the Armstrong : ");
		
		int n= sc.nextInt();
		
		int t1=n;
		int length=0;
		
		
		while(t1!=0) {// this is to find the length of the variable..
			
			length = length + 1;
			t1=t1/10;
		}
		
		System.out.println("length = " +length);
		
		int t2=n;
		int rem=0;
		
	    int armstrong=0;
	   
		while(t2!=0) { // this is to find the last digit and further iteration..
			
			int multiply= 1;
			
			rem= t2 % 10;
			
			for(int i=1; i<=length; i++) {
				
				multiply = multiply * rem;
		
			}
			
			armstrong= armstrong + multiply;
			
			t2= t2/10;
			
		}
		
		System.out.println(armstrong);
		
		if (armstrong == n) {
			
			System.out.println("It is a Armstrong no..");
		}
		
		else {
			
			System.out.println("It is not a Armstrong no..");
			
		}
		
		sc.close();
	}

}
