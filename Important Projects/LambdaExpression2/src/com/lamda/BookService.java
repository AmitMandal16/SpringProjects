package com.lamda;

import java.util.Collections;
import java.util.List;

public class BookService {

	
	public List<Book> getAllBook(){
		List<Book> list = BookDao.insertBook();
		/*
		 * Collections.sort(list, new Comparator<Book>() { //Anonymous class  --> 1st Approach 
		 * 
		 * @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
		 * method stub return o1.getAuthor().compareTo(o2.getAuthor()); }
		 * 
		 * 
		 * });
		 */
		
		Collections.sort(list, (b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()) );  //--> 2nd Approach 
		
		return list;
	}
	
	public static void main(String[] args) {
		
		System.out.println(new BookService().getAllBook());
	}
}

	

