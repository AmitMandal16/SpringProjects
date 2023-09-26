package com.amit.springBootRestAPI.exception;

public class ProductNotFound extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
     public ProductNotFound(Long id){
    	 
    	 super("Product id is not available" +id);
		
	}

}
