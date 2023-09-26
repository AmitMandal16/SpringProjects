package com.amit.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class AuthenticationDao {
	
	static Connection conn= ConnectionUtil.getConnection();
	static Logger log= Logger.getLogger(AuthenticationDao.class.getName());
	
	public static boolean validate(String user, String password) {
		
		log.info("Inside validate method");
		boolean valid= false;
		
		String query = "SELECT * FROM USER_VALID WHERE USER_NAME=? AND PASS=?";
		
	    try {
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, user);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			valid= rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valid;
		
	}

}
