package com.lamda.stream.sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.lamda.stream.Employee;

public class MapSortingStream {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Amit");
		map.put(2, "Nawaz");
		map.put(3, "Ranjith");
		map.put(4, "Ankur");
		
		List<Entry<Integer, String>> list= new ArrayList<>(map.entrySet());
		
		/*
		 * Collections.sort(list, new Comparator<Entry<Integer, String>>() {
		 * 
		 * @Override public int compare(Entry<Integer, String> o1, Entry<Integer,
		 * String> o2) { // TODO Auto-generated method stub return
		 * o1.getValue().compareTo(o2.getValue()); } });
		 */
	
		Collections.sort(list, (o1,o2)-> o1.getValue().compareTo(o2.getValue()));
		
		for(Entry<Integer, String> entry: list) {
			
			System.out.println(entry.getKey()+ " , "+entry.getValue());
			
		}
		
		//using stream api
		System.out.println("------------------------------");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		//using stream api
				System.out.println("for Custom Objec ------------------------------");
	   Map<Integer, Employee> emp= new TreeMap<>();
		
		emp.put(1, new Employee(101, "Amit", 2200000));
		emp.put(2, new Employee(102, "Nawaz", 1900000));
		emp.put(3, new Employee(103, "Laxman", 1200000));
		emp.put(4, new Employee(104, "Ranjith", 1800000));
		
		emp.entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		
	}

}
