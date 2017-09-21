package com.reparo.springAOP.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters()")
	public void LoggingAdvice() {
		System.out.println("Advice Run. Logging Aspect called");
	}
	
	@After("allGetters()")
	public void LoggingAdviceAfter() {
		System.out.println("Advice Run. Logging Aspect called. After get Method");
	}
	
	@Pointcut("execution(* get*(..))")
	public void allGetters() {}
	
	/*@Pointcut("execution(* * com.reparo.springAOP.model.Circle.*(..)")
	public void allCircle() {}*/
	@Pointcut("within(com.reparo.springAOP.model.Circle)")
	public void allCircle() {}
	
}
