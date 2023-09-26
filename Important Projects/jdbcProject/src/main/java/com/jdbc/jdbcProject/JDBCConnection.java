package com.jdbc.jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	private static final String url= "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String username = "system";
	private static final String password = "oracle";
	
	
	public static Connection getConnection() { 
		Connection conn=null;
		
		try {	
			Class.forName("oracle.jdbc.driver.OracleDriver");		
			conn=DriverManager.getConnection(url, username, password);
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
}
