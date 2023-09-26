package com.amit.springSecurity.generator;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder encrypt= new BCryptPasswordEncoder();
		
		String userPass= "amit123";	
		String encoderPass= encrypt.encode(userPass);
		
		System.out.println("User Password : " + encoderPass);
		
		String adminPass= "amit456";
		String encoderPassAdmin= encrypt.encode(adminPass);
		
		System.out.println("Admin Password : " + encoderPassAdmin);

	}

}
