package com.lamda;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		
		list.add("Amit");
		list.add("Nawaz");
		list.add("Laxman");
		list.add("Ankur");
		list.add("Ranjith");
		
		list.stream().forEach(t -> System.out.println(t));  
		
		System.out.println("********************");
		//filter 
		list.stream().filter(t -> t.startsWith("A")).forEach(t -> System.out.println(t));
		
		System.out.println("********************");
		
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Amit");
		map.put(2, "Nawaz");
		map.put(3, "Ranjith");
		map.put(4, "Ankur");
		
		map.forEach((k, v)-> System.out.println(k+ " , " +v));
		map.entrySet().forEach(obj -> System.out.println(obj));
		
		System.out.println("********************");
		//filter 
		map.entrySet().stream().filter(k -> k.getKey()% 2==0).forEach(t -> System.out.println(t));
		
		System.out.println("********************");
	}

}
