package com.serializationExample.Serialization;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class MainRead {
	
	public static void main(String[] args) {
		
		String fileName="C:\\Users\\mandal\\Desktop\\EOSL_TA\\FDP_EOSL\\EOSL-FDP_Documents\\test.json";
		try {
			FileReader fr= new FileReader(fileName);
			
			JSONObject json= (JSONObject) JSONValue.parse(fr);
			
			System.out.println(json);
			
			String name= (String) json.get("name");
			System.out.println(name);
			
			long age= (long) json.get("age");
			System.out.println(age);
			
			double amountSpent= (double) json.get("amountSpent");
			System.out.println(amountSpent);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
