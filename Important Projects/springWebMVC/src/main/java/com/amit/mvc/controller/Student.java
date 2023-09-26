package com.amit.mvc.controller;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String fname;
	private String lname;
	private String major;

	/**
	 * @param fname
	 * @param lname
	 * @param major
	 */
	public Student(String fname, String lname, String major) {

		this.id = (long) Math.floor(Math.random() * 1000);
		this.fname = fname;
		this.lname = lname;
		this.major = major;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", major=" + major + "]";
	}

}
