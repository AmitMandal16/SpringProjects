package com.amit.practise;

public class FibonacciSeriesWithRecursion {
	
	static int a=0, b=1, c;
	
	public static void main(String[] args) {
		
		System.out.print(a+" , "+b);
		
		fibonaci(10);
		
	}
	
	static void fibonaci(int n) {
		
		if(n>=1) {
			
			c= a+b;
			System.out.print(" , " +c);
			a=b;
			b=c;
			
			fibonaci(n-1);
			
		}
			
	}
	

}
