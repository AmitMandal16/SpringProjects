package com.amit.hibernateDemo;

import java.util.Objects;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String job;
	private double salary;

	public Employee() {
		
	}
	
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param job
	 * @param salary
	 */
	public Employee(int id, String firstName, String lastName, String job, double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, job, lastName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(job, other.job)
				&& Objects.equals(lastName, other.lastName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", job=" + job
				+ ", salary=" + salary + "]";
	}

}
