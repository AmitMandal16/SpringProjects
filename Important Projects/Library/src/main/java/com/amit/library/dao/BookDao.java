package com.amit.library.dao;

import java.util.List;
import java.util.Optional;

import com.amit.library.model.Book;

public interface BookDao<Table> {
	
	public void addBook(Book book);
	
	List<Book> viewBooks();
	
	Optional<Table> showBookById(int id);
	
	public void updateBook(Book book);

	public void deleteBook(int id);

}
