package com.amit.springbootAdvance.controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@Configuration
public class MailController implements CommandLineRunner {
	
	@Autowired
	JavaMailSender javaMailSender;

	@Override
	public void run(String... args) throws MessagingException, IOException  {
		
		System.out.println("Message Sending...");
	//	sendMail();
	//	sendMessagewithAttachment();
		
		System.out.println("Message sent...");
		
	}
	
	/* private void sendMail() {
		
		SimpleMailMessage msg= new SimpleMailMessage();
		msg.setTo("amitmandalbm99@gmail.com");
		msg.setSubject("Message sent from Spring boot");
		msg.setText("Hello Amit \n\n Welocome to Spring boot");
		
		javaMailSender.send(msg);
		
	} */
	
	private void sendMessagewithAttachment() throws MessagingException, IOException{
		
		MimeMessage mime= javaMailSender.createMimeMessage();
		
		MimeMessageHelper mimeMessage = new MimeMessageHelper(mime, true);
		mimeMessage.setTo("himnisharora1@gmail.com");
		mimeMessage.setSubject("Message sent from Spring boot");
		mimeMessage.setText("Hello Himnish, \n\nWelcome to Spring boot and here is cute dog picture attached. \n\nThanks");
		mimeMessage.addAttachment("cute_puppy.jpg", new ClassPathResource("Labrador-Puppy-Training.jpg"));
		
		javaMailSender.send(mime);
		
	}
	
	

}
