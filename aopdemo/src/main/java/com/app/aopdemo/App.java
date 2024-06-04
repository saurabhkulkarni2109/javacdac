package com.app.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.aopdemo.dao.AccountDAO;
import com.app.aopdemo.dao.MembershipDAO;

public class App 
{
    public static void main( String[] args )
    {
    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
    AccountDAO theDAO=context.getBean("bean1", AccountDAO.class);
    MembershipDAO memDAO=context.getBean("bean2", MembershipDAO.class);
    theDAO.addAccount();
    memDAO.addAccount();
    memDAO.addSilly();
    
    theDAO.doWork(10,20);
    context.close();
    }
}
