package com.reparo.Annotations.JSR250;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBasicApp {

	public static void main(String[] args) {

		// Spring Way 2 of creating is DOI
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com\\reparo\\Annotations\\JSR250\\springBean.xml");
		context.registerShutdownHook();
		Shape e2 = context.getBean("circle", Shape.class);
		e2.draw();
	}

}
