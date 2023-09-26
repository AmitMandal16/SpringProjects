package com.lamda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public static List<Book> insertBook(){
		
		List<Book> list= new ArrayList<>();
		
		list.add(new Book(101,"James Gosling","Java", 2500));
		list.add(new Book(102,"Ananconda","Python", 1500));
		list.add(new Book(103,"Satyajeet","Neelkanth", 2000));
		
		return list;
		
	}

}
