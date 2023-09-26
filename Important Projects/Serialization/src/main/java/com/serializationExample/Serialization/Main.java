package com.serializationExample.Serialization;

import java.io.FileWriter;

import org.json.simple.JSONObject;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		JSONObject json = new JSONObject();
		
		json.put("name", "Avantika");
		json.put("age", 22);
		json.put("gender", "female");
		json.put("isAllergic", false);
		json.put("amountSpent", 153.77);
		
		System.out.println(json.toJSONString());
		
		String fileName="C:\\Users\\mandal\\Desktop\\EOSL_TA\\FDP_EOSL\\EOSL-FDP_Documents\\test.json";
		
		try(FileWriter fw= new FileWriter(fileName)){
			
			json.writeJSONString(fw);
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally{
			System.out.println("Finished writting the file..");
		}

	}

}
