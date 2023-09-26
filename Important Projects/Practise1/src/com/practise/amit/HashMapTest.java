package com.practise.amit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<Integer, String> movie = new HashMap<>();
		movie.put(101, "Avenger infinity war");
		movie.put(102, "End Game");
		movie.put(103, "Rowdy Rathore");
		movie.put(104, "Hera Pheri");
		movie.put(105, "Phir Hera pheri");

		//Retrieving both key & values
		Set<Map.Entry<Integer, String>> m = movie.entrySet();

		for (Map.Entry<Integer, String> entry : m) {

			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());

		}

		for (Map.Entry<Integer, String> entry : m) {

			if (entry.getKey() == 103) {
				entry.setValue("Baby");
			}
		}
		
		System.out.println("Updated values : " + movie);
		
		//Retrieving the key
		Set<Integer> k = movie.keySet();

		for (Integer key : k) {
			System.out.println("Retrieving the key -->" +key);
		}
		
		//Retrieving the values
		Collection<String> v= movie.values();
		
		System.out.println("Retrieving the values --> "+v);

	}
	
	
	

}
