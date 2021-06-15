package com.code.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.entity.Category;

public class ReadAllCategory {

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
				//read all from the table Select * from table
					
			List<Category>	lstcategory=session.createQuery("from Category").getResultList();
				
					if(lstcategory.size()==0)
					{
						System.out.println("Sorry not found");
					}
					else
					{
						//loop through the entire list
						for(Category catobj : lstcategory)
						{
							System.out.println(catobj.toString());
						}
						
					}
					session.getTransaction().commit();
				}
				catch(Exception err)
				{
					System.out.println("Error:"+err.getMessage());
				}
			}

		}