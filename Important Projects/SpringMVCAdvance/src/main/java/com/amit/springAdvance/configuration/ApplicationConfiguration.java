package com.amit.springAdvance.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.amit.springAdvance")
public class ApplicationConfiguration {
	
	@Bean
	public InternalResourceViewResolver getView() {
		
		InternalResourceViewResolver view= new InternalResourceViewResolver();
		view.setPrefix("/");
		view.setSuffix(".jsp");
		
		return view;
	}
	
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver multipart = new CommonsMultipartResolver();
		
		multipart.setMaxUploadSize(20971520);//in bytes
		multipart.setMaxInMemorySize(1040000);
		
		return multipart;
	}

}
