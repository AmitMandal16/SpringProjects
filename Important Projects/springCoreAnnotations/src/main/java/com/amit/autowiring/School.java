package com.amit.autowiring;

public class School {

	private int sno;
	private String sname;
	private String board;

	/**
	 * 
	 */
	public School() {

		System.out.println("Default school Constructor  invoked");
	}

	/**
	 * @param sno
	 * @param sname
	 * @param board
	 */
	public School(int sno, String sname, String board) {
		
		System.out.println("parameterised School Constructor  invoked");
		this.sno = sno;
		this.sname = sname;
		this.board = board;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	@Override
	public String toString() {
		return "School [sno=" + sno + ", sname=" + sname + ", board=" + board + "]";
	}

}
