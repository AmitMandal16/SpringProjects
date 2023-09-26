package com.amit.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


@Named("PhoneRepo")
@RequestScoped
public class MobilePhoneRepo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String repoName="AmitShop";
	
	private static Map<String, Double> map ;

	
	static {
		
		map = new HashMap<>();
		map.put("Nokia 3310", 130.25);
		map.put("Apple 6s", 200.00);
		map.put("Apple X", 400.00);
		map.put("Samsung S23", 530.25);
		
	}


	public String getRepoName() {
		return repoName;
	}


	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}


	public static Map<String, Double> getMap() {
		return map;
	}


	public static void setMap(Map<String, Double> map) {
		MobilePhoneRepo.map = map;
	}
	
	
}


