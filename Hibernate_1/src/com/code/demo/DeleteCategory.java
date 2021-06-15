package com.code.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.entity.Category;

public class DeleteCategory {
	
	public static void main(String[] argv)
	{
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
				//delete the object
				int id=1;
			Category objcat=(Category)session.get(Category.class,id);
				if(objcat==null)
				{
					System.out.println("Sorry not found");
				}
				else
				{
					//Remove the record
					
					session.remove(objcat);
				}
				session.getTransaction().commit();
			}
			catch(Exception err)
			{
				System.out.println("Error:"+err.getMessage());
			}
		}

	}
//one to one
//one to many
//many to one
//many to many
