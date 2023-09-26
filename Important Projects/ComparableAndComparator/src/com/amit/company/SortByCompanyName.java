package com.amit.company;

import java.util.Comparator;

public class SortByCompanyName implements Comparator<Company> {

	@Override
	public int compare(Company o1, Company o2) {
		
		return o1.getCompanyName().compareTo(o2.getCompanyName());
	}

}
