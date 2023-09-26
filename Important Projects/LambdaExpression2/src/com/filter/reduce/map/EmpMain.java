package com.filter.reduce.map;

public class EmpMain {

	public static void main(String[] args) {

		double avgsal = EmployeeDB.insertEmp().stream().filter(e -> e.getGrade().equalsIgnoreCase("a"))
				.map(employee -> employee.getSalary())
				.mapToDouble(e -> e)
				.average().getAsDouble();
		
		double sum = EmployeeDB.insertEmp().stream().filter(e -> e.getGrade().equalsIgnoreCase("a"))
				.map(employee -> employee.getSalary())
				.mapToDouble(e -> e)
				.sum();

		System.out.println(avgsal);
		
		System.out.println(sum);
		
		
	}
}
