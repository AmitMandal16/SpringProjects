package com.amit.library.dao;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.amit.library.model.Book;

@Repository
public class BookDaoImpl implements BookDao<Book> {
	
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplete(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addBook(Book book) {
		
		System.out.println("Reached view Books in BookDaoImpl");
		
		String sql= "INSERT INTO BOOK VALUES(?,?,?,?)";
		
		jdbcTemplate.update(sql, book.getId(), book.getBookName(), book.getAuthorName(), book.getNumCopies());
	}

	@Override
	public List<Book> viewBooks() {
		
		System.out.println("Reached view Books in BookDaoImpl");
	
		String sql= "SELECT * FROM BOOK";
		System.out.println(jdbcTemplate.query(sql, rowMapper));
		return jdbcTemplate.query(sql, rowMapper);
	}
	
	RowMapper<Book> rowMapper = (ResultSet rs, int rowNum)->{
		Book b= new Book();
		b.setId(rs.getInt(1));
		b.setBookName(rs.getString(2));
		b.setAuthorName(rs.getString(3));
		b.setNumCopies(rs.getInt(4));
		return b;
		
	};

	@Override
	public Optional<Book> showBookById(int id) {
		String query= "SELECT * FROM BOOK WHERE BOOK_ID=?";
		Book book= null;
		
		try {
			book= jdbcTemplate.queryForObject(query, rowMapper, id);
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Optional.ofNullable(book);
	}
	
	@Override
	public void updateBook(Book book) {

		String sql = "update Book set BOOK_NAME = ?, AUTHOR_NAME =?, NO_COPIES=? where BOOK_ID=?";
		
		jdbcTemplate.update(sql, new Object[] {book.getBookName(), 
				book.getAuthorName(), book.getNumCopies(), book.getId()});
	}

	@Override
	public void deleteBook(int id) {
		String sql = "delete from Book where BOOK_ID=?";

		jdbcTemplate.update(sql, new Object[] {id});
	}
	
}
