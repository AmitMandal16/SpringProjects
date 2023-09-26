package com.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		//Predicate<Integer> pd = t -> t%2 ==0 ;
		
		//System.out.println(pd.test(10));
		
		List<Integer> list= Arrays.asList(10,20, 8,6,5);
 		
 		list.stream().filter(t -> t%2 ==0).forEach(t -> System.out.println(" Printing the even no -> "+t));
	}

}
