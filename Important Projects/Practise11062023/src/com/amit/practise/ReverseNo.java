package com.amit.practise;

public class ReverseNo {
	
	public static void main(String[] args) {
		
		
		int rem=0, rev=0;
		
		int n=735;
		
		int temp= n;
		
		while(n!=0) {
			
			rem= n%10;
			
			rev= rev*10 + rem;
			
			n= n/10;
		}
		
		System.out.println("Reverse of the no is : "+rev);
		
		//to check palindrome
		if(temp == rev) {
			
			System.out.println("It is a Palindrome no ..");
			
		}
		else {
			
			System.out.println("It is not a Palindrome no ..");
			
		}
		
	}

}
