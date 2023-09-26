package com.amit.springJDBC;

import java.util.List;
import java.util.Optional;

public interface CompanyDAOInterface<Table> {
	
	List<Table> list();
	
	Optional<Table> getById(int id);
	
	void add(Table t);
	
	void update(Table t);

}
