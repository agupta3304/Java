package com.code.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.entity.Category;

public class EditCategory {

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
		//first we have pass the id 
			// then get record with that id
			// then update the value 
			//save the object
			int id=1;
		Category objcat=(Category)session.get(Category.class,id);
			if(objcat==null)
			{
				System.out.println("Sorry not found");
			}
			else
			{
				System.out.println("found");
				//update the value
				//old value with value
				objcat.setName("Edit Test");
				//save the object
				//saveorupdate will create anew record if id(pk) is null
				//otherwise it will update the record
				session.saveOrUpdate(objcat);
			}
			session.getTransaction().commit();
		}
		catch(Exception err)
		{
			System.out.println("Error:"+err.getMessage());
		}
	}

}
