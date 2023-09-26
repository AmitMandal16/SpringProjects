package com.serializationExample.Serialization.Obj;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

public class EmployeeMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		JSONArray jarray = new JSONArray();

		Employee emp1 = new Employee(1, "Sarath", "C#");
		Employee emp2 = new Employee(2, "Himnish", "SAP");

		jarray.add(emp1);
		jarray.add(emp2);
		
		System.out.println(jarray);

		String fileName="C:\\Users\\mandal\\Desktop\\EOSL_TA\\FDP_EOSL\\EOSL-FDP_Documents\\empList.json";
		
		try (FileWriter fw = new FileWriter(fileName)) {

			jarray.writeJSONString(fw);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finished writting...");
		}

	}

}
