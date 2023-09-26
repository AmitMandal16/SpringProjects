package com.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

     	public static void main(String[] args) {
			
     	//	Consumer<Integer> c =(t) -> System.out.println("Printing value -> " +t);
     		
     	//	c.accept(10); 
     		
     		
     		List<Integer> list= Arrays.asList(10,20, 8,6,5);
     		
     		list.stream().forEach(t -> System.out.println("Printing value -> " +t));
		}
}
