package com.amit.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentManagerImpl implements StudentManager {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> getStudentDetails() {
		
		System.out.println("Reached student maneger method getStudentDetails()");
		
		return studentDao.addListStudent();
	}

}
