package com.amit.serilization;

import java.io.Serializable;

public class Account implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static String account_type = "LOAN";
	private long account_no;
	private String customerName;
	private double loan_balance;

	public Account(long account_no, String customerName, double loan_balance) {

		this.account_no = account_no;
		this.customerName = customerName;
		this.loan_balance = loan_balance;
	}

	public static String getAccount_type() {
		return account_type;
	}

	public static void setAccount_type(String account_type) {
		Account.account_type = account_type;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getLoan_balance() {
		return loan_balance;
	}

	public void setLoan_balance(double loan_balance) {
		this.loan_balance = loan_balance;
	}

	@Override
	public String toString() {
		return "Account [account_no=" + account_no + ", customerName=" + customerName + ", loan_balance=" + loan_balance
				+ "]";
	}

}
