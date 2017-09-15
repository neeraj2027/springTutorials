package com.reparo.basicSpringDOI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBasicApp {
	
	public static void main(String[] args) {
		/*
		//Primitive way of Creating Objects
		Employee e1 = new Employee();
		e1.setEid(11);
		e1.setEname("Arun");
		e1.seteAddress("Indore");
		System.out.println(e1.toString());
		*/
		
	/*	//Spring Way 1 of creating is DOI
		Resource resource = new ClassPathResource("springBean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee e2 = factory.getBean("emp2", Employee.class);
		Employee e3 = factory.getBean("emp3", Employee.class);
		Employee e4 = factory.getBean("emp4", Employee.class);*/
		
		
		//Spring Way 2 of creating is DOI
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\reparo\\basicSpringDOI\\springBean.xml");
		Employee e2 = context.getBean("emp2", Employee.class);
		Employee e3 = context.getBean("emp3", Employee.class);
		Employee e4 = context.getBean("emp4", Employee.class);
		
		
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
	}

}
