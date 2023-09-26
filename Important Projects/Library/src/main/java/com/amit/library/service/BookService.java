package com.amit.library.service;

import java.util.List;
import java.util.Optional;

import com.amit.library.model.Book;

public interface BookService<Table> {
	
	List<Book> viewBooks();

	void addBook(Book book);
	
	Optional<Table> showBookById(int id);
	
	public void updateBook(Book book);

	public void deleteBook(int id);

}
