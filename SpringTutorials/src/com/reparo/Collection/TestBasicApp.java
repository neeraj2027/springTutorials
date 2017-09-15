package com.reparo.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBasicApp {

	public static void main(String[] args) {

		// Spring Way 2 of creating is DOI
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\reparo\\Collection\\springBean.xml");
		Triangle e2 = context.getBean("triangle", Triangle.class);
		e2.draw();
	}

}
