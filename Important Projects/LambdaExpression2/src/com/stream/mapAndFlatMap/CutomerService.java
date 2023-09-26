package com.stream.mapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class CutomerService {
	
	public static void main(String[] args) {
		
		List<Customers> c= CustomerDao.getAllCust();
		/*
		 * for(Customers cu: c) {
		 * 
		 * System.out.println("Traditional Approach --> "+cu.getEmail());
		 * 
		 * }
		 */
		List<String> listemail = c.stream().map(cust -> cust.getEmail()).collect(Collectors.toList());
		
		System.out.println("By Map using Lamda expression List of emails -> " +listemail);
		
		List<List<String>> Mpno = c.stream().map(cust -> cust.getPhno()).collect(Collectors.toList());
	
		System.out.println("By Map using Lamda expression List of phone no -> " +Mpno);
		
		//using flat Map
		
		List<String> pno = c.stream().flatMap(cust -> cust.getPhno().stream()).collect(Collectors.toList());
		
		System.out.println("By FlatMap using Lamda expression List of phone no -> " +pno);
	} 

}
