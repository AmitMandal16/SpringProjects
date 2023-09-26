package com.amit.restServices.RestAPI.entity;

import java.io.Serializable;

public class Books implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String book_id;
	private String book_author;
	private String book_title;
	private int book_price;
	
	public Books() {
		
	}

	/**
	 * @param book_id
	 * @param book_author
	 * @param book_title
	 * @param book_price
	 */
	public Books(String book_id, String book_author, String book_title, int book_price) {
		// super();
		this.book_id = book_id;
		this.book_author = book_author;
		this.book_title = book_title;
		this.book_price = book_price;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

}
