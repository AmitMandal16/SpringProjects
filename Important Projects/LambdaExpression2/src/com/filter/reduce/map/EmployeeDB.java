package com.filter.reduce.map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {
	
	public static List<Employee> insertEmp(){
		
		return Stream.of(new Employee(1,"Bholu" ,"D",40000),
				new Employee(2,"Dholu" ,"D",40000),
				new Employee(3,"Bheem" ,"A",60000),
				new Employee(4,"Raju" ,"C",45000),
				new Employee(5,"Kalia" ,"A",50000)).collect(Collectors.toList());
	}

}
