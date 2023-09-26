package com.filter.reduce.map;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		
    long start=0;
    long end=0;
    
    start= System.currentTimeMillis(); 
    
    IntStream.range(1, 100).forEach(System.out:: println);
    
    end= System.currentTimeMillis();
    
    System.out.println("Time took " +(end-start));
    
    System.out.println("****************************");
    
    start= System.currentTimeMillis(); 
    IntStream.range(1, 100).parallel().forEach(System.out:: println);
    end= System.currentTimeMillis();
    
    System.out.println("Time took for parallel stream -> " +(end-start));
    
    
	}

}
