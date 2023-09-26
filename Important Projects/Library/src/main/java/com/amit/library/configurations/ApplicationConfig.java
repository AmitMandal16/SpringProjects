package com.amit.library.configurations;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.amit.library.dao.BookDao;
import com.amit.library.dao.BookDaoImpl;
import com.amit.library.model.Book;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.amit.library")
public class ApplicationConfig {
	
	@Bean
	public InternalResourceViewResolver getView() {
		InternalResourceViewResolver view= new  InternalResourceViewResolver();
		
		view.setPrefix("/");
		view.setSuffix(".jsp");
		
		return view;
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
	public BookDao<Book> bookDao() {
		
		BookDaoImpl bookdaoImpl= new BookDaoImpl();
		bookdaoImpl.setJdbcTemplete(getjdbctemp());
		
		return bookdaoImpl;
		
	}

}
