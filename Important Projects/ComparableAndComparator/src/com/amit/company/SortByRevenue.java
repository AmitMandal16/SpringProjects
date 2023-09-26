package com.amit.company;

import java.util.Comparator;

public class SortByRevenue implements Comparator<Company> {

	@Override
	public int compare(Company o1, Company o2) {
		
		if(o1.getRevenue()> o2.getRevenue()) {
			return 1;
		}
		
		else if(o1.getRevenue()< o2.getRevenue()) {
			return -1;
		}
		
		else if(o1.getRevenue()== o2.getRevenue()) {
			
			return o1.getCompanyName().compareTo(o2.getCompanyName());
		}
		
		return 0;
	}	

}
