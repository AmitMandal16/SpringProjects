package com.amit.StringEx;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s= "Avantika";
		
		String rev="";
		
		for(int i= s.length()-1; i>=0; i--) {
			
			rev= rev + s.charAt(i);	
			
		}
		System.out.println(rev);
		
		//to check palindrome
		
		if(rev.equals(s)) {
			System.out.println("It is a Palindrome String");
		}
		else {
			System.out.println("It is not a Palindrome String");
		}

	}
	
		

}
