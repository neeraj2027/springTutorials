package com.reparo.BeanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBasicApp {

	public static void main(String[] args) {

		// Spring Way 2 of creating is DOI
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\reparo\\BeanFactoryPostProcessor\\springBean.xml");
		Triangle e2 = context.getBean("triangle", Triangle.class);
		System.out.println(e2.toString());
	}

}
