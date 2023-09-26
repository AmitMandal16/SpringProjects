package com.amit.springbootAdvance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.amit.springbootAdvance.interceptor.BookHandlerInterceptor;

@Component
public class WebAppConfig implements WebMvcConfigurer {

	@Autowired
	BookHandlerInterceptor bookHandlerInterceptor;
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(bookHandlerInterceptor);
		
	}
}
