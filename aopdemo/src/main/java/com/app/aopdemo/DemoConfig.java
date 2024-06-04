package com.app.aopdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.app.aopdemo.dao.AccountDAO;
import com.app.aopdemo.dao.MembershipDAO;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.app.aopdemo")
public class DemoConfig {

	@Bean(name="bean1")
	public AccountDAO accountDAO()
	{
		return new AccountDAO();
	}
	@Bean(name="bean2")
	public MembershipDAO memberDAO() {
		return new MembershipDAO();
	}
	
}
