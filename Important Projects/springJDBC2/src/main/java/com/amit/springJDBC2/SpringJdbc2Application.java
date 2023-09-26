package com.amit.springJDBC2;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJdbc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbc2Application.class, args);
	}
	
     @Bean
	ApplicationRunner applicationRunner(CompanyEmployeeDetailsRepo companyEmployeeDetailsRepo) {
		return args ->{
			
			Company c1=  Company.create(null, "Meshach", "Samuel", 1);
			Company c2=  Company.create(null, "Pawan", "Vadapali", 2);
			
			System.out.println("********************");
			System.out.println(companyEmployeeDetailsRepo.save(c1));
			System.out.println(companyEmployeeDetailsRepo.save(c2));
			System.out.println("********************");  
			
			/*
			 * System.out.println("\n********************\n");
			 * System.out.println(companyEmployeeDetailsRepo.findAll());
			 * System.out.println("\n********************\n");
			 * 
			 * System.out.println(companyEmployeeDetailsRepo.findById(101));
			 */
			
		};
		
	}

	/*
	 * @Bean ApplicationRunner applicationRunner(DesignationDetailsRepository
	 * designationDetailsRepository ) {
	 * 
	 * return args ->{
	 * 
	 * System.out.println("*************************"); //Designation d1=
	 * Designation.add(null, "Vice President");
	 * //System.out.println(designationDetailsRepository.save(d1));
	 * 
	 * Designation d2= Designation.add(null, "President");
	 * //System.out.println(designationDetailsRepository.save(d2));
	 * 
	 * System.out.println(designationDetailsRepository.findAll());
	 * System.out.println(designationDetailsRepository.findById(2L));
	 * 
	 * System.out.println("*************************");
	 * 
	 * };
	 * 
	 * }
	 */
}
