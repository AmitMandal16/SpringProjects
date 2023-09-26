package com.filter.reduce.map;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
	
	public static void main(String[] args) {
		
		List<Integer> n= Arrays.asList(10,20,30,40);
		
		int sum = 0;
		
		
		for(Integer i: n) {
			
			sum = sum+i;
			
		}
		
		System.out.println(sum);
		
		int s= n.stream().mapToInt(i-> i).sum();
		
		System.out.println("Sum using stream using map -> " +s);
		
		int r= n.stream().reduce(0, (a,b)-> a+b); // like that we can do multiple arithmetic operation.
		
		// n.stream().reduce(Integer::sum);
		
		System.out.println("Sum using stream using reduce -> " +r);
		
		int max= n.stream().reduce(0, (a,b)-> a>b ? a:b);
		
		System.out.println("max value using stream using reduce -> " +max);
		
		
		List<String> word= Arrays.asList("Java","Hibernate","Spring");
		
	      String w =	word.stream()
			 .reduce((word1 , word2) -> word1.length()> word2.length()? word1: word2).get();
	      
	      System.out.println("Longest word -> " +w);
	}

}
