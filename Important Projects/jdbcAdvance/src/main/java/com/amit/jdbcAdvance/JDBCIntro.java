package com.amit.jdbcAdvance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class JDBCIntro 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
	
    	try(Connection conn= JDBCSUtil.getConnection();) {
			
    		//Class.forName("oracle.jdbc.driver.OracleDriver"); --> Not needed after java 5..
			
			if(conn!=null) {
				System.out.println("Connection established sucessfully...");
			}
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
