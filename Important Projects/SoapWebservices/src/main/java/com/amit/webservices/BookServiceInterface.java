package com.amit.webservices;

import java.util.List;

import com.amit.webservices.entity.Book;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface BookServiceInterface {
	
	@WebMethod
	public List<Book> getAllBooks();

}
