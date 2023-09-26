  package com.amit.springJDBC;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}
	
	private CompanyDAOInterface<Company> compInterface;
	
	public SpringJdbcApplication(CompanyDAOInterface<Company> compInterface){
		
		this.compInterface= compInterface;
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	//	String query= "	CREATE TABLE COMPANY(EMPID NUMBER PRIMARY KEY, FIRSTNAME VARCHAR(20),"
	//			+ " LASTNAME VARCHAR(20), DEG VARCHAR(20) )";
		
	//	jdbcTemplate.execute(query);
		
		
		// String queryins= "INSERT INTO COMPANY VALUES(?,?,?,?)";
		
		//	jdbcTemplate.update(queryins, 102, "Nawaz","Khaza", "Technical Lead");
		//	jdbcTemplate.update(queryins, 103, "Deb","Mishra", "Project Manager");
		//	jdbcTemplate.update(queryins, 104, "Laxman","Kumar", "Technical Lead");
		//  jdbcTemplate.update(queryins, 105, "Fictious","Kumar", "Solution Lead");
		
		
		// String queryUpdate= "UPDATE COMPANY SET DEG = ? WHERE EMPID =? ";
		
		// jdbcTemplate.update(queryUpdate,  "SR. Project Manager", 103);
		
	/*	String viewQuery = "SELECT * FROM COMPANY";
		
		List emplist = jdbcTemplate.queryForList(viewQuery);
		
		System.out.println("**************************************");
		for(Object list: emplist ) {
			
			System.out.println(list.toString());
			
		}
		System.out.println("**************************************");
		
		String deleteQuery= "DELETE FROM COMPANY WHERE EMPID=?";
		jdbcTemplate.update(deleteQuery, 105);
		
		System.out.println("Emp details deleted sucessfully..");    */
		
		
		System.out.println("**************************************");
	    List<Company> list= compInterface.list();
	    
	    for(Company comp: list) {
	    	System.out.println("**************************************");
	    	System.out.println("Employee ID: "+comp.getEmpId());
	    	System.out.println("Employee Name: "+comp.getFirstName());
	    	System.out.println("Employee Last Name: "+comp.getLastName());
	    	System.out.println("Employee Designation: "+comp.getDesignation());
	    	System.out.println("**************************************");
	    	
	    }
		
	    Optional<Company> comp= compInterface.getById(101);
	    System.out.println("###########################");
	    System.out.println(comp.get());
	    System.out.println("###########################");
	    
	    Company c=  new Company(106, "Rohit", "Mandal", "Intern");
	    compInterface.add(c);
	    
	    Company c2=  compInterface.getById(101).get();
	    c2.setDesignation("Architect");
	    
	    compInterface.update(c2);
	    
	        
	}
	
	
	
	
	
	
	
}
