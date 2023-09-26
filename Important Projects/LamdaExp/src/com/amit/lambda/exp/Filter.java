package com.amit.lambda.exp;

@FunctionalInterface
public interface Filter<T> {
	
	boolean test(T element);

}
