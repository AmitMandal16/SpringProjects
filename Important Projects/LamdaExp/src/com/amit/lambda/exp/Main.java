package com.amit.lambda.exp;

public class Main {
	
	public static void greet(String name, String customGreet, Greeting greeting) {
		
		System.out.println(greeting.customGreeting(customGreet, name));
		
	}

	public static void main(String[] args) {
		
		greet("Welcome","Avani", new Greeting() {
			
			@Override
			public String customGreeting(String name, String customGreet) {
				return "Good morning";
			}
		});
		
		greet("Avantika", "Welcome Aboard", (name, customGreet) -> name+ " , " + customGreet);
		
		greet("Amit", "Good Evening How're you doing",(name, customGreet) -> name+" "+customGreet);
		
	}
}
