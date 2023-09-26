package com.amit.autowiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int admNo;
	private String sname;
	private String stream;
	
	@Autowired(required = false)
	//@Qualifier("schoolBean")
	private School school;
	
	@Autowired(required = false)
	private State state;
	
	private List<String> notes;
	
	public Student() {
		System.out.println("Default Student Constructor  invoked");
	}

	
	
	
	/**
	 * @param admNo
	 * @param sname
	 * @param stream
	 * @param school
	 * @param state
	 * @param notes
	 */
	//@Autowired
	public Student(int admNo, String sname, String stream, School school, State state, List<String> notes) {
		this.admNo = admNo;
		this.sname = sname;
		this.stream = stream;
		this.school = school;
		this.state = state;
		this.notes = notes;
	}

	

	public int getAdmNo() {
		return admNo;
	}

	
	public void setAdmNo(int admNo) {
		this.admNo = admNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public School getSchool() {
		return school;
	}

	  //@Qualifier when multiple beans are there and to restrict the Autowiring to specific beans
	public void setSchool(School school) {
		System.out.println("Setter school invoked");
		this.school = school;
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state= state;
		System.out.println("Setter State invoked");
	}

	public List<String> getNotes() {
		return notes;
	}

	public void setNotes(List<String> notes) {
		this.notes = notes;
	}


	@Override
	public String toString() {
		return "Student [admNo=" + admNo + ", sname=" + sname + ", stream=" + stream + ", school=" + school + ", state="
				+ state + ", notes=" + notes + "]";
	}



}
