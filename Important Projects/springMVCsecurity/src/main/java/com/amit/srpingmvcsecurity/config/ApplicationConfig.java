package com.amit.srpingmvcsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.amit.srpingmvcsecurity")
public class ApplicationConfig {
	
	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver() {
		
		InternalResourceViewResolver view = new  InternalResourceViewResolver();
		view.setPrefix("/");
		view.setSuffix(".jsp");
		
		return view;
	}

}
