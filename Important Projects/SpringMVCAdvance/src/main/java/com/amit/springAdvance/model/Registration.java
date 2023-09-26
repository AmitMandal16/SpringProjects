package com.amit.springAdvance.model;

import java.util.Arrays;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Registration {
    
	@NotBlank(message = "Name should not be empty")
	@Size(min=3, max=50, message="Name should be btw min 3 and max 50 chars")
	private String name;
	
	@NotBlank
	@Email(message= "Email you have entered is not valid..")
	private String email;
	
	@Max(value= 2, message="Allowed only 2 guests")
	private int noGuest;
	private String gender;
	private String department;
	private String[] food;
	
	public Registration(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNoGuest() {
		return noGuest;
	}

	public void setNoGuest(int noGuest) {
		this.noGuest = noGuest;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String[] getFood() {
		return food;
	}

	public void setFood(String[] food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Registration [name=" + name + ", email=" + email + ", noGuest=" + noGuest + ", gender=" + gender
				+ ", department=" + department + ", food=" + Arrays.toString(food) + "]";
	}

	
	
}
