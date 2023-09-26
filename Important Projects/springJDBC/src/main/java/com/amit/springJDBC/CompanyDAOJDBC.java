package com.amit.springJDBC;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class CompanyDAOJDBC  implements CompanyDAOInterface<Company>{
	
	
	private JdbcTemplate jdbcTemplate;
	
	RowMapper<Company> rowMap= (rs, rowNum) -> {
		Company c= new Company();
		
		c.setEmpId(rs.getInt(1));
		c.setFirstName(rs.getString(2));
		c.setLastName(rs.getString(3));
		c.setDesignation(rs.getString(4));
			
		return c;
	};

	
	public CompanyDAOJDBC(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate= jdbcTemplate;
	}

	@Override
	public List<Company> list() {

		String query= "SELECT * FROM COMPANY";
		return jdbcTemplate.query(query, rowMap);
	}

	@Override
	public Optional<Company> getById(int id) {
		String query= "SELECT * FROM COMPANY WHERE EMPID=?";
		Company comp= null;
		
		try {
			comp= jdbcTemplate.queryForObject(query, rowMap, id);
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Optional.ofNullable(comp);
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		String queryins= "INSERT INTO COMPANY VALUES(?,?,?,?)";
		
		jdbcTemplate.update(queryins, c.getEmpId(), c.getFirstName(), c.getLastName()
				,c.getDesignation());
		
	}

	@Override
	public void update(Company c) {
		// TODO Auto-generated method stub
		String queryUpdate= "UPDATE COMPANY SET DEG = ? WHERE EMPID =? ";
		
		jdbcTemplate.update(queryUpdate, c.getEmpId(), c.getFirstName(), c.getLastName()
				,c.getDesignation());
	}

}
