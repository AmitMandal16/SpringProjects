package com.lamda.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static List<Employee> taxPay(String input) {

		return (input.equals("tax")) ?

				EmpDaoService.insertEmp().stream().filter(t -> t.getSalary() > 1000000)
				.collect(Collectors.toList()) :

				EmpDaoService.insertEmp().stream().filter(t -> t.getSalary() <= 1000000)
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {

		System.out.println(taxPay("tax"));

		System.out.println(taxPay("nontax"));
	}
}
