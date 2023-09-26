package com.amit.customer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionUtil {
	
	private static final String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user="system";
	private static final String password="oracle";
	static Logger log= Logger.getLogger(ConnectionUtil.class.getName());
	
	public static Connection getConnection() {
		Connection conn=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn= DriverManager.getConnection(url,user, password);
			
			log.info("Connection establised successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return conn;
	}
}
