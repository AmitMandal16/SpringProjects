package com.amit.lambda.exp;

import java.util.ArrayList;
import java.util.List;

public class HomeMain {

	public static List<Home> listHome() {

		List<Home> list = new ArrayList<>();

		list.add(new Home("Delhi", "Villa", "5000sqft", 50000000));
		list.add(new Home("New York", "Mansion", "3000sqft", 70000000));
		list.add(new Home("Seattle", "Condo", "2000sqft", 40000000));
		list.add(new Home("Mumbai", "Apartment", "4000sqft", 30000000));

		return list;

	}

	public static List<Home> filterHome(List<Home> listHome, Filter<Home> homeFilter) {

		List<Home> filterHome = new ArrayList<>();

		for (Home home : listHome) {

			if (homeFilter.test(home)) {
				filterHome.add(home);

			}
		}

		return filterHome;

	}

	public static void main(String[] args) {
	
		List<Home> homeList= listHome();
		
		System.out.println("Original List : \n" +homeList);
		
		List<Home> filterHomeList= filterHome(homeList, home -> (home.getPrice()>40000000 && 
				home.getPrice()<70000000));
		
	    System.out.println("Filtered List : " +filterHomeList);
		
	}

}
