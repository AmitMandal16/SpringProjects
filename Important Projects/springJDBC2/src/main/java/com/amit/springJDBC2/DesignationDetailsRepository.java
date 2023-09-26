package com.amit.springJDBC2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DesignationDetailsRepository extends CrudRepository<Designation, Long>{

}
