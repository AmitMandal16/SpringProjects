package com.amit.springBootRestAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amit.springBootRestAPI.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
