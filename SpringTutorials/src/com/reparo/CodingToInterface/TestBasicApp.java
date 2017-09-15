package com.reparo.CodingToInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBasicApp {

	public static void main(String[] args) {

		// Spring Way 2 of creating is DOI
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\reparo\\CodingToInterface\\springBean.xml");
		Shape e2 = context.getBean("triangle", Shape.class);
		System.out.println(e2.toString());
	}

}
