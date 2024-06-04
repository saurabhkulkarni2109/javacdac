package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.app.entity.Instructor;
import com.app.entity.InstructorDetail;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
   	    Session session=factory.openSession();
   	    
   	    try {
   	    	Instructor instructor=new Instructor("ash","shinde","ashish@gmail.com");
   	    	InstructorDetail instructor_Detail=new InstructorDetail("https://www.mno.com/youtube","reading");
   	    			
   	    			
   	    			instructor.setInstructor_Detail(instructor_Detail);
   	    			session.beginTransaction();
   	    			session.save(instructor);
   	    	System.out.println("Done!!");		
   	    }finally {
   	    	session.close();
   	    	factory.close();
   	    }
   	    
    }
}
