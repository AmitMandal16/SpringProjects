package com.stream.mapAndFlatMap;

import java.util.List;

public class Customers {
	
	private int id;
	private String name;
	private String email;
	private List<String> phno;
	
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phno
	 */
	public Customers(int id, String name, String email, List<String> phno) {
	//	super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<String> getPhno() {
		return phno;
	}

	public void setPhno(List<String> phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}
	
	
	

}
