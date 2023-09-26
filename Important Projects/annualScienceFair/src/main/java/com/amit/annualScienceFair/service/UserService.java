package com.amit.annualScienceFair.service;

import com.amit.annualScienceFair.model.LogIn;
import com.amit.annualScienceFair.model.User;

public interface UserService {

	boolean registerUser(User user);

	User validUser(LogIn login);

	boolean doesEmailExist(String email);

	boolean doesIdExist(int id);

}
