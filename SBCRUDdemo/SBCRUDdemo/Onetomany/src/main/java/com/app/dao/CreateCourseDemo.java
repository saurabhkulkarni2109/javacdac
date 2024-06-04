package com.app.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Instructor;

public class CreateCourseDemo {

	public static void main(String[] args) {
		

   	 SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(Course.class).buildSessionFactory();
   	    Session session=factory.openSession();
   	    
   	    try {
   	     session.beginTransaction();
   	     int id=4;
   	     Instructor tempInstructor=session.get(Instructor.class,id);
   	     
   	     Course tempCourse1=new Course("Angular");
   	     Course tempCourse2=new Course("java");
   	     
   	     tempInstructor.addone(tempCourse1);
   	     tempInstructor.addone(tempCourse2);
   	     
   	     session.save(tempCourse1);
   	     session.save(tempCourse2); 
   	     
   	     session.getTransaction().commit();   	    
   	
   	     System.out.println("Done/");
   
   	    }finally {
   	    	session.close();
   	    	factory.close();
   	    }
	}
}
