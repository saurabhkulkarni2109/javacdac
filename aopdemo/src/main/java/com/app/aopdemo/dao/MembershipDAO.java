package com.app.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println("Doing MemDB work adding an account!!");
	}
	
	public void addSilly() {
		System.out.println("In silly method!!");
	}
	
	public void doWork(int a,int b)
	{
		System.out.println("Executing MemDAO");
	}
}
