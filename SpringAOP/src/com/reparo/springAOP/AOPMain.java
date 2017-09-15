package com.reparo.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reparo.springAOP.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com\\reparo\\springAOP\\service\\spring.xml");
		ShapeService service = context.getBean("shapeService",ShapeService.class);
		System.out.println(service.getCircle().getName());
	}

}
