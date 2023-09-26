package com.jdbc.jdbcProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentQueries {
	
	private Connection conn = JDBCConnection.getConnection();
	
	public int saveDept(int id, String first_name, String last_name, double hourly_rate, String is_permanent) {
		
		int status= 0;
		
		try {
			
			String query= "insert into department (id, first_name, last_name, hourly_rate, is_fullTime) values(?,?,?,?,?)";
			
			PreparedStatement ps= conn.prepareStatement(query);
			
			ps.setInt(1, id);
			ps.setString(2, first_name);
			ps.setString(3, last_name);
			ps.setDouble(4, hourly_rate);
			ps.setString(5, is_permanent);
			
			status= ps.executeUpdate();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public int update(int id, String first_name, String last_name, double hourly_rate, String is_permanent) {
	
	int status =0;
	
	String query= "update department set first_name=?, last_name=?, hourly_rate=?, is_fullTime=? where id =?" ;
	
	try {
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, first_name);
		ps.setString(2, last_name);
		ps.setDouble(3, hourly_rate);
		ps.setString(4, is_permanent);
		ps.setInt(5, id);
		
		status= ps.executeUpdate();
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return status;
	
	}
	
	 public int delete(int id) {
     	int status = 0;
     	
     	String query= "delete from department where id=?";
     	
     	try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			status= ps.executeUpdate();
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	
     	return status;
     	
     	
     }

	 

	
}
