package com.amit.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
	 //  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	   ApplicationContext context= new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student s= (Student) context.getBean("student");
		System.out.println("Student Bean --> \n"+s);
		
		//((ClassPathXmlApplicationContext)context).close();

		
	}
}
