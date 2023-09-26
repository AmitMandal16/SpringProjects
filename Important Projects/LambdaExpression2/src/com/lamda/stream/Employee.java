package com.lamda.stream;

public class Employee {

	private int id;

	private String ename;

	private int salary;

	/**
	 * @param id
	 * @param ename
	 * @param salary
	 */
	public Employee(int id, String ename, int salary) {
		// super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + "]";
	}

	
}
