package com.serializationExample.Serialization;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONArrayExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		JSONObject json = new JSONObject();

		JSONArray jsonArray = new JSONArray();

		JSONObject json1 = new JSONObject();

		json1.put("name", "Amit");
		json1.put("age", 23);
		json1.put("tech", "Java");

		JSONObject json3 = new JSONObject();
		json3.put("name", "Avani");
		json3.put("age", 22);

		JSONObject json2 = new JSONObject();
		json2.put("name", "Manoj");
		json2.put("age", 22);
		json2.put("tech", "Python");

		jsonArray.add(json1);
		jsonArray.add(json2);
		jsonArray.add(json3);

		json.put("empDetails", jsonArray);

		System.out.println(json.toJSONString());

		String fileName = "C:\\Users\\mandal\\Desktop\\EOSL_TA\\FDP_EOSL\\EOSL-FDP_Documents\\testArray.json";

		try (FileWriter fw = new FileWriter(fileName)) {

			json.writeJSONString(fw);

		}

		catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Finished writting the file..");
		}

	}

}
