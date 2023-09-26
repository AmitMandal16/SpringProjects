package com.amit.autowiring;

public class Student {

	private int admNo;
	private String sname;
	private String stream;
	private School school;
	
	public Student() {
		
	}

	/**
	 * @param admNo
	 * @param sname
	 * @param stream
	 * @param school
	 */
	public Student(int admNo, String sname, String stream, School school) {
		System.out.println("Paramerterised connst call Student");
		this.admNo = admNo;
		this.sname = sname;
		this.stream = stream;
		this.school = school;
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
		System.out.println("Setter method call Student");

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

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [admNo=" + admNo + ", sname=" + sname + ", stream=" + stream + ", school=" + school + "]";
	}

}
