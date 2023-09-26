package com.practise.amit;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Repository<Integer> intVar= new Repository<>(2209);
		
		Repository<String> stringVar= new Repository<>("Hi Amit");
		
		Repository<Double> doubleVar= new Repository<>(2209.99);
		
		Repository<Date> dateVar= new Repository<>(Calendar.getInstance().getTime());
		
		Repository<String> s1= new Repository<>("Amit");
		Repository<String> s2= new Repository<>("Amit");
		
		
		System.out.println(intVar);
		
		System.out.println(stringVar);
		
		System.out.println(doubleVar);
		
		System.out.println(dateVar);
		
		System.out.println(s1.equals(s2));

	}

}
