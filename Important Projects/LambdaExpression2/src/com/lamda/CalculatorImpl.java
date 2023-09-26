package com.lamda;


interface Calculator{
	
	int add(int a, int b);
	
}

public class CalculatorImpl {
	
	public static void main(String[] args) {
		
		//Calculator c = (int a, int b) -> { return a+b; };  --> 1st way
		
		Calculator c = (a, b) ->  a+b; //2nd way
		
		System.out.println(c.add(4,5));
		
		Calculator c1= (a,b) ->{
			
			if(a>b) {
				throw new RuntimeException();
			}
			else {
				return a+b;
			}
		};
		
	}

}
