package com.lamda.stream;

import java.util.ArrayList;
import java.util.List;

public class EmpDaoService {
	
	public static List<Employee> insertEmp(){
		
		List<Employee> emp= new ArrayList<>();
		
		emp.add(new Employee(101, "Amit", 2200000));
		emp.add(new Employee(102, "Nawaz", 1800000));
		emp.add(new Employee(103, "Laxman", 800000));
		emp.add(new Employee(104, "Ankur", 1000000));
		
		return emp;
		
	}

}
