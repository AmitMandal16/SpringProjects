package com.amit.springbootAdvance.model;

public class Book {

	private Integer id;
	private String name;
	private String authorName;

	public Book() {

	}

	/**
	 * @param id
	 * @param name
	 * @param authorName
	 */
	public Book(Integer id, String name, String authorName) {
		this.id = id;
		this.name = name;
		this.authorName = authorName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
