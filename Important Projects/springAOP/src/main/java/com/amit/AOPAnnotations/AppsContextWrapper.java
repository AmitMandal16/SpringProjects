package com.amit.AOPAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppsContextWrapper {

	private static ApplicationContext ctx= new ClassPathXmlApplicationContext();
	
	private AppsContextWrapper() {
		
	}
	
	public static  ApplicationContext getContext() {
		return ctx;
	}
}
