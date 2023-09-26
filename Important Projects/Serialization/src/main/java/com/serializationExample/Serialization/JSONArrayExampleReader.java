package com.serializationExample.Serialization;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONArrayExampleReader {

	public static void main(String[] args) {

		String fileName = "C:\\Users\\mandal\\Desktop\\EOSL_TA\\FDP_EOSL\\EOSL-FDP_Documents\\testArray.json";
		try {
			FileReader fr = new FileReader(fileName);

			JSONObject json = (JSONObject) JSONValue.parse(fr);
			
			JSONArray jsonArray = (JSONArray) json.get("empDetails");

			for (Object object : jsonArray) {

				JSONObject json1 = (JSONObject) object;

				System.out.println("\n **Employee Details**");
				
                for(Object obj: json1.entrySet() ) {
                	System.out.println(obj);
                }
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
