package com.amit.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({"com.amit.mvc"})
public class SimpleAppConfiguration {
	
	@Bean
	public InternalResourceViewResolver getView() {
		
		InternalResourceViewResolver view= new InternalResourceViewResolver();
		view.setPrefix("/");
		view.setSuffix(".jsp");
		
		return view;
		
	}

}
