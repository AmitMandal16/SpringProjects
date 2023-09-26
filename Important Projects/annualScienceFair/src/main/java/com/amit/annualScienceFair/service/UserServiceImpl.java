package com.amit.annualScienceFair.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.annualScienceFair.dao.UserDao;
import com.amit.annualScienceFair.model.LogIn;
import com.amit.annualScienceFair.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean registerUser(User user) {
		
		return userDao.registerUser(user);
	}

	@Override
	public User validUser(LogIn login) {
		// TODO Auto-generated method stub
		return userDao.userLogin(login);
	}

	@Override
	public boolean doesEmailExist(String email) {
		// TODO Auto-generated method stub
		return userDao.doesEmailExist(email);
	}

	@Override
	public boolean doesIdExist(int id) {
		// TODO Auto-generated method stub
		return userDao.doesIdExist(id);
	}

}
