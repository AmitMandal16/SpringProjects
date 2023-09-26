package com.amit.springbootAdvance.interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class BookHandlerInterceptor implements HandlerInterceptor{
	
	@Autowired
	JavaMailSender javaMailSender;
	
	private static final SimpleDateFormat dateformat= new SimpleDateFormat("MM.dd.yyyy hh:mm:ss");
	
	
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response,
			Object handler)
			throws Exception {
		
		if(request.getParameter("bookId")!=null) {
			
			System.out.println("preHandle() method called and sending book access email");
			
			sendEmail(request.getParameter("bookId"), " Book accessed.. ");
			
			System.out.println("Email sent");
		}
		

		return true;
	}
	
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			 ModelAndView modelAndView) throws Exception {
		
            if(request.getParameter("bookId")!=null) {
			
			System.out.println("postHandle() method called and sending book access email");
			
			sendEmail(request.getParameter("bookId"), " Book access completed.. ");
			
			System.out.println("Email sent");
		}
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
				Exception ex) throws Exception {
		
		 if(request.getParameter("bookId")!=null) {
				
				System.out.println("Sending book request and response completed email");
				
				sendEmail(request.getParameter("bookId"), "Request and response completed ");
				
				System.out.println("Email sent");
		 }
		
		}

	private void sendEmail(String bookId, String message) {
		// TODO Auto-generated method stub
		
		SimpleMailMessage msg= new SimpleMailMessage();
		
		msg.setTo("amitmandalbm99@gmail.com");
		msg.setSubject("Book related activity " +bookId);
		msg.setText(message+ " : " +dateformat.format(new Date()));
		
		javaMailSender.send(msg);
		
	}
	

}
