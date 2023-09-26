package com.amit.company;

import java.util.List;

public class IterateUtil {
	
	public static<T> void iterateComp(List<T> list) {
		
		for(T element: list) {
			System.out.println(element);
		}
	}

}
