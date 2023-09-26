package com.amit.annualScienceFair.dao;

import com.amit.annualScienceFair.model.LogIn;
import com.amit.annualScienceFair.model.User;

public interface UserDao {

	boolean registerUser(User user);
	
	User userLogin(LogIn login);
	
	boolean doesEmailExist(String email);
	
	boolean doesIdExist(int id);
}
