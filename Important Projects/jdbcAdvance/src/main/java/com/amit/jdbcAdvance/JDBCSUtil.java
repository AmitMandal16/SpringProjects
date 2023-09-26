package com.amit.jdbcAdvance;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCSUtil {
	
	public static Connection getConnection() throws SQLException {
		
		Connection conn= null;
		
		try(InputStream io= JDBCSUtil.class.getResourceAsStream("/JDBC.properties") ){
			
			Properties prop= new Properties();
			prop.load(io);
			
			String url= prop.getProperty("url") ;
		    String username = prop.getProperty("user") ;
		    String password = prop.getProperty("password") ;
		    
		    conn= DriverManager.getConnection(url, username, password);
		    
		    if(conn!=null) {
				System.out.println("Connection established sucessfully...");
			}
		}
		catch(IOException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return conn;
	}

}
