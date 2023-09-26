package com.amit.annualScienceFair.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.amit.annualScienceFair.validators.NotDuplicateEmail;
import com.amit.annualScienceFair.validators.NotDuplicateId;

public class User {

	@Min(value = 1, message = "Student id must be equal or greater than 1")
	@Max(value = 1000000, message = "Student id must be equal or less than 1,000,000")
	@NotDuplicateId
	private int studentId;
	
	@NotEmpty(message = "University name cannot be empty")
	private String universityName;
	
	@NotEmpty(message = "Name cannot be empty")
	private String studentName;
	
	@NotEmpty(message = "Select project area")
	private String projectArea;
	
	@NotEmpty(message = "Email should not be empty")
	@Email(message = "Should be of the form name@nokia.com")
	@NotDuplicateEmail
	private String email;
	private String password;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getProjectArea() {
		return projectArea;
	}

	public void setProjectArea(String projectArea) {
		this.projectArea = projectArea;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
