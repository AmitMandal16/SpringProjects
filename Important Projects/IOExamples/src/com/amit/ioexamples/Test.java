package com.amit.ioexamples;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		     String a= "AmitMandal";
		     
		     Map<String, Long> count = Arrays.stream(a.split(""))
		    		 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));	
		     
		     System.out.println(count);
		     
	}

}
