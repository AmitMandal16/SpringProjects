package com.amit.StringEx;

public class MaxCharRep {

	public static void main(String[] args) {
		
		int[] arr= new int[127];
		
		String s= "avantika";
		
		for(int i=0; i<s.length();i++) {
			
			arr[s.charAt(i)]= arr[s.charAt(i)]+1;
		}
		
		int max=-1;
		
		char c= ' ';
		
		for(int i=0; i<s.length();i++) {
			
			if(max<arr[s.charAt(i)]) {
				
				max= arr[s.charAt(i)];
				c= s.charAt(i);
			}
		}
		
		System.out.println("Max rep char are : "+c+ " = " +max);
		
	}
}
