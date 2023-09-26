package com.amit.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Override
	public List<Student> addListStudent() {
		
		List<Student> list= new ArrayList<>();
		list.add(new Student("Amit", "Mandal", "Computer Science"));
		list.add(new Student("Chandan", "Kabdal", "Management"));
		list.add(new Student("Ashwani", "Singh", "Physics"));
		list.add(new Student("Pawan", "Mandal", "Maths"));
		
		return list;
	}

}
