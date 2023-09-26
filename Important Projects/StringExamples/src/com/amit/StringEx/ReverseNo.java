package com.amit.StringEx;

public class ReverseNo {
	
	public static void main(String[] args) {
		
		int rev=0, rem=0;
		
		int n = 743;
		
		while(n!=0) {
			
			rem = n % 10;
			
			rev = rev * 10 + rem;
			
			  n = n/10;
			 
		}
		System.out.println(rev);
	}
}
