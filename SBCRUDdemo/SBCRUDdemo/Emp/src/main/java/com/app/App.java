package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Employe;

import jakarta.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employe.class).buildSessionFactory();
    	    Session session=factory.openSession();
    	    session.beginTransaction();
    	    
    	    Employe e=new Employe("Rohit",3000000,"soft dev");
//    	    session.save(e);
			
			
			 TypedQuery<Employe>query=session.getNamedQuery("findEmployeByName");
			 query.setParameter("name","Rohit");
			 List<Employe>employees=query.getResultList();
			 Iterator<Employe>itr=employees.iterator();
			 while(itr.hasNext()) {
				 Employe e1= itr.next();
				 System.out.println(e1); 
				 }
			 
   	    session.getTransaction().commit();
    	    session.close();
    	    factory.close();
    }
}
