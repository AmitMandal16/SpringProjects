package com.serializationExample.SerilizationObjectEx;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.CDL;
import org.json.JSONArray;

public class CSVReader {
	
	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\mandal\\Desktop\\EOSL_TA\\FDP_EOSL\\EOSL-FDP_Documents\\Active-FDP_NDS-X-CZ18-G014-20220209.xlsx";
		
		String s= new String(Files.readAllBytes(Paths.get(path)));
		
		JSONArray jsonArray = CDL.toJSONArray(s);
		
		System.out.println(jsonArray.toString());
		
		try(FileWriter fw= new FileWriter("")){
			jsonArray.write(fw, 2, 0);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
