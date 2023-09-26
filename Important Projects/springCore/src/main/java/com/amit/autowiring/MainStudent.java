package com.amit.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowireStud.xml");
		
		Student s= (Student) context.getBean("studentBean");
		System.out.println("Student Bean --> \n"+s);

	}

}
