package com.mit;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CourseDAO {
	public static void main(String[] args) {
		 SessionFactory factory=new Configuration()
				 .configure("hibernate.cfg.xml")
				 .addAnnotatedClass(Course.class)
				 .buildSessionFactory();
		 
		 Session session=factory.getCurrentSession();
		 
		 try {
			 session.beginTransaction();
			 Course obj=new Course(103,"RDBMS");
			 session.save(obj);
			 
			 //System.out.println("Query Result");
			 //List<Course> list= session.createQuery("from Course where courseName LIKE 'j%'").list();
			 //System.out.println(list);
			 
			 session.getTransaction().commit();
		 }finally {
			 factory.close();
		 }

			}

		}
