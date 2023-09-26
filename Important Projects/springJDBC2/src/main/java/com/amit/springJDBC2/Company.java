package com.amit.springJDBC2;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("COMPANY")
public class Company {
	
	@Id
	@Column("EMPID")
	private Integer empId;
	
	@Column("FIRSTNAME")
	private String firstName;
	
	@Column("LASTNAME")
	private String lastName;
	
	@Column("DEG")
	private Integer designation;

	/**
	 * @param empId
	 * @param firstName
	 * @param lastName
	 * @param designation
	 */
	public Company(Integer empId, String firstName, String lastName, Integer designation) {
	      
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
	}
	
	public Company() {
		
	}
	
	
	static Company create(Integer empId, String firstName, String lastName, Integer designation) {
		 return new Company( empId, firstName, lastName, designation);
	}
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	public Integer getDesignation() {
		return designation;
	}

	public void setDesignation(Integer designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Company [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", designation="
				+ designation + "]";
	}
	
	

}
