package com.amit.webservices.dao;

import java.util.ArrayList;
import java.util.List;

import com.amit.webservices.entity.Book;

public class BookDao {
	
	public static List<Book> getAllBooks(){
		
		List<Book> book= new ArrayList<>();
		
		book.add(new Book("ISBN101", "Neelkanth", "Satayajeet", (float)8.0));
		book.add(new Book("ISBN102", "Data Structure & Algo in java", "James Gosling", (float)20.5));
		book.add(new Book("ISBN103", "Body Language", "Amit Mandal", (float)11.5));
		book.add(new Book("ISBN104", "Sapiens", "Chandan", (float)10.2));
	
		return book;
		
		
	}

}
