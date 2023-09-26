package com.amit.springJDBC2;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyEmployeeDetailsRepo extends CrudRepository<Company, Long>{
	
	@Query("SELECT * FROM COMPANY")
    List<Company> findAll();
	
	@Query("SELECT * FROM COMPANY WHERE EMPID= :EMPLOYEE_ID")
	Company findById(@Param("EMPLOYEE_ID") int id);
}
