package com.amit.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.library.dao.BookDao;
import com.amit.library.model.Book;

@Service
public class BookServiceImpl implements BookService<Book> {
	
	@Autowired
	BookDao<Book> bookDao;

	@Override
	public List<Book> viewBooks() {
		// TODO Auto-generated method stub
		return bookDao.viewBooks();
	}

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
		
	}

	@Override
	public Optional<Book> showBookById(int id) {
		// TODO Auto-generated method stub
		return bookDao.showBookById(id);
	}

	@Override
	public void updateBook(Book book) {
		
		bookDao.updateBook(book);
	}

	@Override
	public void deleteBook(int id) {
		
		bookDao.deleteBook(id);
		
	}

}
