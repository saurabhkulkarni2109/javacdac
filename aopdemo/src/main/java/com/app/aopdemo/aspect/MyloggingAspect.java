package com.app.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyloggingAspect {

	@Before("execution(public void com.app.aopdemo.dao.AccountDAO.addAccount())")
	public void addAccountBeforeAdvice() {
		System.out.println("Before Advice called!!");
	}
	@Before("executing(public * doWork(..))")
	public void beforeAddAccountAdvice()
	{
		System.out.println("Executing @before advice on doWork()");
	}
}
