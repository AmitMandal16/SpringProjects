package com.amit.StringEx;

public class PrimeNo {

	public static void main(String[] args) {
		
		
		int no=6;
		
		int temp=0;
		
		for(int i=2; i<= no-1; i++) {
			
			if(no % i == 0) {
				temp= temp+1;
			}
			
		}
		
	    System.out.println( (temp == 1) ? "Prime Number": " Not prime no");
		
	}
}
