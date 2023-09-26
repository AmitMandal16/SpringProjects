package com.amit.jdbcAdvance;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PuppyDao {

	public static void main(String[] args) {

		try (Connection conn = JDBCSUtil.getConnection();) {
			
			String query= "UPDATE PUPPY SET PUPPY_IMAGE=? WHERE PUPPY_ID=101";

			PreparedStatement ps = conn.prepareStatement(query);
			
			FileInputStream fi= new FileInputStream("C:\\weblogic12c\\image\\Labrador-Puppy-Training.jpg\\");
			
			ps.setBlob(1, fi, fi.available());
			
			int status= ps.executeUpdate();
			
			System.out.println("Image uploaded sucessfully.." +status);
			
			if (conn != null) {
				System.out.println("Connection established sucessfully...");
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
