package com.amit.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
           cfg=  cfg.configure("hibernate.cfg.xml");
           
           SessionFactory factory = cfg.buildSessionFactory();
           
           Session session= factory.openSession();
           
           Employee emp1= new Employee(101, "Amit", "Mandal", "Software Engineer", 800000.00);
           Employee emp2= new Employee(102, "Debashis", "Mishara", "Project Manager", 1800000.00);
           
           Transaction t= session.beginTransaction();
           session.save(emp1);
           session.save(emp2);
           
           t.commit();
           
           session.close();
           factory.close();
    }
}
