package com.stream.mapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {

	public static List<Customers> getAllCust(){
		
		return Stream.of(new Customers(101,"Shivani", "shiavni@hcl.com",Arrays.asList("123456","789021", "456789")),
				new Customers(102,"Peter", "peter@abc.com",Arrays.asList("123006","121009", "294678")),
				new Customers(103,"Parker", "parker@def.com",Arrays.asList("234566","112344", "987654")),
				new Customers(104,"Andrew", "and@xxx.com",Arrays.asList("123908","219842", "453209")))
				.collect(Collectors.toList());
	}
	
}
