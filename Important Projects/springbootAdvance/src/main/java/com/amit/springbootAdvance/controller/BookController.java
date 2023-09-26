package com.amit.springbootAdvance.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amit.springbootAdvance.model.Book;

@RestController
public class BookController {
	
	private static Map<Integer, Book> bookMap= new HashMap<>();
	
	static {
	  Book b =new Book(101,"DSA in Java","Amit");
	  bookMap.put(b.getId(), b);
	  
	  Book b2= new Book(102,"Python","Manoj");
	  bookMap.put(b2.getId(), b2);
	}
	
    @RequestMapping(value= "/")
	public String Welcome() {
		return "Hi Welcome to Book Store";
	}


    @RequestMapping(value= "/book")
	public ResponseEntity<Object> getBook(@RequestParam Integer bookId) {
    	
		return new ResponseEntity<>(bookMap.get(bookId), HttpStatus.OK);
	}
	
}
