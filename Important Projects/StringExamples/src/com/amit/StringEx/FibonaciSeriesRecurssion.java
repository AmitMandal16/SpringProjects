package com.amit.StringEx;

public class FibonaciSeriesRecurssion {
	
	static int a= 0, b=1,c;

	
	public static void main(String[] args) {
		
		System.out.print(a+ " , " +b);
		FibonaciSeriesRecurssion f= new FibonaciSeriesRecurssion();
		f.fibnaciSeries(10);
	}

	void fibnaciSeries(int i) {
		if(i>=1) {
		c=a+b;
		System.out.print(" , "+c);
		a=b;
		b=c;
		fibnaciSeries(i-1);
		}
	}
}
