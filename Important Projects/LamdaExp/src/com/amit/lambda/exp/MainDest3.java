package com.amit.lambda.exp;

public class MainDest3 {
	
	public static void main(String[] args) {
		Destinations dest= new Destinations() {

			/*@Override
			public String destWedding() {
				
				return "Udaipur";
			}
*/
			@Override
			public String destWedding(String name) {
				
				return name;
			}};
			
			System.out.println(dest.destWedding("udaipur"));
			
			//Destinations destlambda= () -> "Jodhpur";
			
			Destinations destlambda1 = (String name) -> "Rajasthan, " +name.toUpperCase();
	
			
		    System.out.println(destlambda1.destWedding("Amit"));
	}
	
	

}
