package com.amit.reflection;

public class Employee {

	private int sapno;
	private String name;
	@InRange(minvalue=10000, maxvalue=1000000)
	private double salary;

	public Employee(int sapno, String name, double salary) {

		this.sapno = sapno;
		this.name = name;
		this.salary = salary;
	}

	public int getSapno() {
		return sapno;
	}

	public void setSapno(int sapno) {
		this.sapno = sapno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [sapno=" + sapno + ", name=" + name + ", salary=" + salary + "]";
	}

}
