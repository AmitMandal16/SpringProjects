package com.serializationExample.SerilizationObjectEx;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class SerilizationEx {

	public static void main(String[] args) {

		JSONObject emp = new JSONObject();
		emp.put("name", "Dharma");
		emp.put("Age", 45);
		emp.put("Deg", "GPM");

		System.out.println(emp);

		String fn = "C:\\Users\\mandal\\Desktop\\EOSL_TA\\FDP_EOSL\\EOSL-FDP_Documents\\emp.json";

		try (FileWriter fw = new FileWriter(fn)) {

			emp.write(fw,2,0);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			System.out.println("Finished writting..");
		}
	}

}
