package com.reparo.MessageSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBasicApp {
	
	public static void main(String[] args) {
		
		//Spring Way 2 of creating is DOI
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\reparo\\MessageSource\\springBean.xml");
		Employee e2 = context.getBean("emp2", Employee.class);
/*		Employee e3 = context.getBean("emp3", Employee.class);
		Employee e4 = context.getBean("emp4", Employee.class);*/
		
		
		//System.out.println(context.getMessage("helloCircle", null, "HelloDefault Message", null));
		
		e2.display();
		//System.out.println(e2.toString());
/*		System.out.println(e3.toString());
		System.out.println(e4.toString());*/
	}

}
