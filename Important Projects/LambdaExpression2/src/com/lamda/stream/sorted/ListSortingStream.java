package com.lamda.stream.sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.lamda.stream.EmpDaoService;
import com.lamda.stream.Employee;

public class ListSortingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Amit");
		list.add("Nawaz");
		list.add("Laxman");
		list.add("Ankur");
		list.add("Ranjith");
		
		// for Wrapper & String
		
		list.stream().sorted().forEach(t -> System.out.println("Sorted list -> " +t)); //ascending order
		
		System.out.println("***************");
		
		list.stream().sorted(Comparator.reverseOrder())
		.forEach(t -> System.out.println("Sorted list -> " +t)); //Descending order
		
		// for custom class using old class
		System.out.println("--------------------------------------------------------");
		
		List<Employee> emp= EmpDaoService.insertEmp();
		
		emp.stream().sorted((o1,o2) -> o1.getSalary() - o2.getSalary() )
		.forEach(t -> System.out.println("Sorted list -> " +t));
		
	
		System.out.println("--------------------------------------------------------");
		emp.stream().sorted(Comparator.comparing(Employee:: getEname)).forEach(t -> System.out.println("Sorted list -> " +t));

	}

}
