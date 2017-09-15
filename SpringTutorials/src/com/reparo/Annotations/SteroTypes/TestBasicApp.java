package com.reparo.Annotations.SteroTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBasicApp {

	public static void main(String[] args) {

		// Spring Way 2 of creating is DOI
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\reparo\\Annotations\\SteroTypes\\springBean.xml");
		Shape e2 = context.getBean("circle", Shape.class);
		e2.draw();
	}

}
