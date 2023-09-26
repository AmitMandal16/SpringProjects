package com.amit.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MainComparable {

	public static void main(String[] args) {
		
		List<Company> list = new ArrayList<>();
		
		list.add(new Company("HCL Tech","India ", 10));
		list.add(new Company("Nokia","Finland ", 25));
		list.add(new Company("Google","USA ", 225));
		list.add(new Company("Samsung","SouthKorea ", 75));
		
		System.out.println("*****Before sorting***********");
		IterateUtil.iterateComp(list);
		
		//Collections.sort(list);
		
	//	Collections.sort(list, new SortByCompanyName());
		
		Collections.sort(list, new SortByRevenue());
		
		System.out.println("*****After sorting***********");
		IterateUtil.iterateComp(list);
	}
}
