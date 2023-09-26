package com.lamda;

public class Book {

	private int id;
	private String author;
	private String name;
	private int cost;

	/**
	 * @param id
	 * @param author
	 * @param cost
	 */
	public Book(int id, String author, String name, int cost) {

		this.id = id;
		this.author = author;
		this.name= name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", name=" + name + ", cost=" + cost + "]";
	}
	
	

}
