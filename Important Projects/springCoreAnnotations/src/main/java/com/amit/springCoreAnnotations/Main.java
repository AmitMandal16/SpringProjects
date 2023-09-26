package com.amit.springCoreAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(IOTBeanConfig.class);
		
		IOTDevice io= context.getBean(IOTDevice.class);
		
		System.out.println(io);
		
		((AnnotationConfigApplicationContext)context).close();
		
	}

}
