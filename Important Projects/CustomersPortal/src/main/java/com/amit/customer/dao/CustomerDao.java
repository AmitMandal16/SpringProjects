package com.amit.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.amit.customer.model.Customer;

public class CustomerDao {

	static Logger log= Logger.getLogger(CustomerDao.class.getName());
	


	public static int save(Customer c) {
		
		log.info("-------Inside save method---------------");
		int status = 0;

		String query = "INSERT INTO CUSTOMERS(ID, NAME, EMAIL, GENDER, COUNTRY) VALUES(?,?,?,?,?)";
		try {
			Connection conn = ConnectionUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, c.getId());
			ps.setString(2, c.getName());
			ps.setString(3, c.getEmail());
			ps.setString(4, c.getGender());
			ps.setString(5, c.getCountry());

			status = ps.executeUpdate();

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}

	public static int update(Customer c) {
		
		log.info("-------Inside Update method---------------");

		int status = 0;

		String query = "UPDATE CUSTOMERS SET NAME, EMAIL, GENDER, COUNTRY WHERE ID=?";

		try {
			Connection conn = ConnectionUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, c.getName());
			ps.setString(2, c.getEmail());
			ps.setString(3, c.getGender());
			ps.setString(4, c.getCountry());
			ps.setInt(5, c.getId());

			status = ps.executeUpdate();

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;

	}

	public static List<Customer> view() {
		
		log.info("-------Inside View method---------------");
		
		List<Customer> list = new ArrayList<>();

		String query = "SELECT * FROM CUSTOMERS";

		try {
			Connection conn = ConnectionUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Customer c = new Customer();
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setEmail(rs.getString(3));
				c.setGender(rs.getString(4));
				c.setCountry(rs.getString(5));

				list.add(c);

			}

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

	public static Customer viewEmpById(int id) {
		
		log.info("-------Inside viewEmpById method---------------");
		
		Customer c = new Customer();

		String query = "SELECT * FROM CUSTOMERS WHERE ID=?";

		try {
			Connection conn = ConnectionUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setEmail(rs.getString(3));
				c.setGender(rs.getString(4));
				c.setCountry(rs.getString(5));

			}

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}

	public static int delete(int id) {
		
		log.info("-------Inside delete method---------------");
		
		int status = 0;

		String query = "DELETE FROM CUSTOMERS WHERE ID=?";

		try {
			Connection conn = ConnectionUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);

			status = ps.executeUpdate();

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;

	}

}
