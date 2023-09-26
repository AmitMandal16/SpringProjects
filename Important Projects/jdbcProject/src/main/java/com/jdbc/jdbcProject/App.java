package com.jdbc.jdbcProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	
    	DepartmentQueries dep= new DepartmentQueries();
    	//dep.saveDept(104, "Arnold", "Schawazer", 19, "false");
    	
    	//int status= dep.update(104, "Arnold", "Schawazer", 19, "true");
    	int status= dep.delete(104);
    	System.out.println(status);
    	
        try (Connection conn = JDBCConnection.getConnection();){
        	
        	if(conn!=null) {
        		System.out.println("Successfully established the connection");
        		System.out.println("----------------------------------------");
        		
        	}
        	
        	Statement st= conn.createStatement();
        	
        	String query = "SELECT * FROM DEPARTMENT";
        	
        	 ResultSet rs= st.executeQuery(query);
        	 
        	while(rs.next()) {
        		
        	System.out.println(rs.getInt(1) +" , "+rs.getString(2) +" , "
        	+ rs.getString(3) +" , " +rs.getInt(4)+ " , "+rs.getString(5));
        	
        	}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
       
       
        
    }
}
