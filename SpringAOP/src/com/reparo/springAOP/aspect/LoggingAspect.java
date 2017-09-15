package com.reparo.springAOP.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void LoggingAdvice() {
		System.out.println("Advice Run. Logging Aspect called");
	}
	
	@After("execution(public String getName())")
	public void LoggingAdviceAfter() {
		System.out.println("Advice Run. Logging Aspect called. After Set Method");
	}
}
