package com.amit.reflection;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodError {
		
		Class<?> emp= Class.forName("com.amit.reflection.Employee");
		
		System.err.println("My error message!");
	}

}
