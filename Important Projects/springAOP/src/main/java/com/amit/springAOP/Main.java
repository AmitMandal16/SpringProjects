package com.amit.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amit.springAOP.pointcuts.Items;

public class Main 
{
    public static void main( String[] args ){
    	
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
    	Items i= (Items) ctx.getBean("itemOne");
    	
        i.printItemdetails();
    }
}
