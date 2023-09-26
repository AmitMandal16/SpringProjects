package com.amit.webservices;

import java.util.List;

import com.amit.webservices.dao.BookDao;
import com.amit.webservices.entity.Book;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.amit.webservices.BookServiceInterface")
public class MyWebserviceImpl implements BookServiceInterface {

	@Override
	public List<Book> getAllBooks() {

		return BookDao.getAllBooks();
	}

	
   
}
