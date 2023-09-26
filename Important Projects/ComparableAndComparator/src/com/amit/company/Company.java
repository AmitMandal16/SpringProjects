package com.amit.company;

public class Company implements Comparable<Company>{
	
	private String companyName;
	
	private String headQuarter;
	
	private double revenue;

	/**
	 * @param companyName
	 * @param headQuarter
	 * @param revenue
	 */
	public Company(String companyName, String headQuarter, double revenue) {
		super();
		this.companyName = companyName;
		this.headQuarter = headQuarter;
		this.revenue = revenue;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getHeadQuarter() {
		return headQuarter;
	}

	public void setHeadQuarter(String headQuarter) {
		this.headQuarter = headQuarter;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", headQuarter=" + headQuarter + ", revenue=" + revenue + "]";
	}

	@Override
	public int compareTo(Company c) {
		//sorted by revenue
		if(this.getRevenue()>c.getRevenue()) {
			return 1;
		}
		
		else if(this.getRevenue()<c.getRevenue()) {
			return -1;
		}
		
		
		return 0;
		//return this.getCompanyName().compareTo(c.getCompanyName());	//By Name
	}

	
	

}
