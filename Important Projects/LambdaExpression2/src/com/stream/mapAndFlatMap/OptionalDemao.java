package com.stream.mapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemao {
	
	public static Customers getEmailCutomers(String email) {
		
		   List<Customers>  mail = CustomerDao.getAllCust();
		   
		   return mail.stream().filter(e -> e.getEmail().equals(email)).findAny().get();
		
	}
	
	public static void main(String[] args) {
		
		Customers c= new Customers(102,"Peter", "peter@abc.com" ,Arrays.asList("123006","121009", "294678"));
		
		Optional<Object> empty= Optional.empty(); 
		System.out.println(empty);
		
	  //  Optional<Object> of = Optional.of(c.getEmail());
	//	System.out.println(of);  // Will throw Null pointer exception --> we are sure object is not empty use this..
		
		Optional<Object> ofNull =Optional.ofNullable(c.getEmail());
		
		if(ofNull.isPresent()) {
		System.out.println(ofNull.get());
		}// will not throw the null pointer expect and return empty.
		//we are  not sure object is not empty use this..
		
		System.out.println("cutomers by email -> " +getEmailCutomers("parker@def.com"));
		
		
		
		
		
		
	}

}
