package com.amit.restServices.RestAPI.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.amit.restServices.RestAPI.entity.Books;

public class BookDao {

	private static final String driver = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String username = "system";
	private static final String password = "oracle";

	private static Connection conn = null;

	public static Connection getConnection() {

		if (conn == null) {

			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");

				conn = DriverManager.getConnection(driver, username, password);

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return conn;

	}

	public static List<Books> getAllBook() {

		List<Books> list = new ArrayList<>();

		String query = "SELECT * FROM BOOKS	";

		try {
			conn = BookDao.getConnection();
			System.out.println("Connection establised sucessfully.." + conn);

			PreparedStatement ps = conn.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Books b = new Books();
				b.setBook_id(rs.getString(1));
				b.setBook_author(rs.getString(2));
				b.setBook_title(rs.getString(3));
				b.setBook_price(rs.getInt(4));

				list.add(b);

				/*
				 * for(Books book:list) {
				 * 
				 * System.out.println(book);
				 * 
				 * }
				 */
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

	public static Books getByID(String id) {

		System.out.println("*******Calling getBookById query method_*****");

		Books b = new Books();

		String query = "SELECT * FROM BOOKS WHERE BOOK_ID=?";

		try {
			conn = getConnection();

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				b.setBook_title(rs.getString(1));
				b.setBook_author(rs.getString(2));
				b.setBook_title(rs.getString(3));
				b.setBook_price(rs.getInt(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;

	}

	public static String addBook(Books b) {

		System.out.println("*******Calling update query method_*****");

		int status = 0;
		String response = "";

		String query = "	INSERT INTO BOOKS(BOOK_ID,  BOOK_AUTHOR, BOOK_TITLE, BOOK_PRICE) VALUES(?,?,?,?)";

		try {
			conn = getConnection();

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, b.getBook_id());
			ps.setString(2, b.getBook_author());
			ps.setString(3, b.getBook_title());
			ps.setInt(4, b.getBook_price());

			status = ps.executeUpdate();

			String success = "Success --> " + b.getBook_id();
			String error = "Error --> " + b.getBook_id();

			response = (status == 1) ? success : error;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Returning response : " + response);
		return response;

	}

	public static String updateBooks(Books b) {

		System.out.println("*******Calling Update query method_*****");

		String response = "";

		int status = 0;

		String query = "	UPDATE BOOKS SET BOOK_AUTHOR=?, BOOK_TITLE=?, BOOK_PRICE=? WHERE BOOK_ID=?";

		try {
			conn = getConnection();

			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, b.getBook_author());
			ps.setString(2, b.getBook_title());
			ps.setInt(3, b.getBook_price());
			ps.setString(4, b.getBook_id());

			status = ps.executeUpdate();

			String success = "Success --> " + b.getBook_id();
			String error = "Error --> " + b.getBook_id();

			response = (status == 1) ? success : error;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response = "Error" + e.getMessage();
		}

		System.out.println("Returning response : " + response);

		return response;

	}

	public static String deleteBooks(String id) {

		System.out.println("*******Calling delete query method_*****");

		String response = "";
		int status = 0;

		String query = "DELETE FROM BOOKS WHERE BOOK_ID = ?";

		try {
			conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, id);

			status = ps.executeUpdate();
			String success = "Success --> " + id;
			String error = "Error --> " + id;

			response = (status == 1) ? success : error;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Returning response : " + response);

		return response;

	}
}
