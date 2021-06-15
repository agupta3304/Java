package com.code.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.entity.Category;


public class AddCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the Session factory
		// create session factory
	SessionFactory factory = new Configuration()
							.configure("hibernate.cfg.xml")
							.addAnnotatedClass(Category.class)
							.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try
		{
		//Transaction object
			session.beginTransaction();
			//create the object of the Class Category and pass the value
			Category catobj=new Category(2, "Pen");
			//Save the object to the database table
			session.save(catobj);
			// commit transaction
			session.getTransaction().commit();
		}
		catch(Exception err)
		{
			System.out.println(err.getMessage());
		}
	}

}
