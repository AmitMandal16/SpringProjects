package com.amit.autowiring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	
	@Bean
	public Student student() {
		
		List<String> notes= new ArrayList<>();
		notes.add("Day Boarding");
		notes.add("English Medium");
		
		Student s = new Student();
		s.setAdmNo(2946);
		s.setSname("Amit");
		s.setStream("Science");
		s.setNotes(notes);
		
		
		return s;
		
	}
	
	@Bean
	public School school() {
		return new School(1001, "Columbus School", "CBSE");
	}
	
	@Bean
	public State state() {
		
		State st= new State();
		st.setPin(121009);
		st.setStName("Haryana");
		
		return st;
		
	}

}
