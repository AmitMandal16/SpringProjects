package com.amit.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
	
		ApplicationContext app= new ClassPathXmlApplicationContext("beans.xml");
		
		IOTDevice io= app.getBean("iot", IOTDevice.class);
		
		System.out.println(io);
		
		
		((ClassPathXmlApplicationContext)app).close();
		
	}

}
