package com.amit.StringEx;

public class MaxArrayandMinArray {

	
	public static void main(String[] args) {
		
		int a[]= {3,8,9,4,2,5};
		
		int max= a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(max < a[i]) {
			max= a[i];
			}
			
		}
		
		System.out.println("Max value = " +max);
		
		int min= a[0];
		
        for(int i=0; i<a.length; i++) {
			
			if(min > a[i]) {
			min= a[i];
			}
			
		}
        
        System.out.println("Min value = " +min);
	}
	
	
	
}
