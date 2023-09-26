package com.amit.annualScienceFair.configuration;

import java.time.Duration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.amit.annualScienceFair.dao.UserDao;
import com.amit.annualScienceFair.dao.UserDaoImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="com.amit.annualScienceFair")
public class AppsConfig implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver getView() {
		InternalResourceViewResolver view= new  InternalResourceViewResolver();
		
		view.setPrefix("/");
		view.setSuffix(".jsp");
		
		return view;
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static_files/**")
				.addResourceLocations("/static_files/")
				.setCacheControl(CacheControl.maxAge(Duration.ofDays(365)));
	} 
	
	@Bean
	public DataSource getdataSource() {
		
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	    dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
	    dataSource.setUsername("system");
	    dataSource.setPassword("oracle");
		
		return dataSource;
	}

	@Bean
	public JdbcTemplate getjdbctemp() {
		 JdbcTemplate jdbcTemplate = new JdbcTemplate();
		  jdbcTemplate.setDataSource(getdataSource());
		
		    return jdbcTemplate;
	}
	
	@Bean
	public UserDao userDao() {
		
		UserDaoImpl user= new UserDaoImpl();
		user.setJdbcTemplete(getjdbctemp());
		
		return user;	
		
	}
}
