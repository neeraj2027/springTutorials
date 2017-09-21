package com.reparo.jdbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reparo.jdbc.model.User;

public class JDBCMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\reparo\\jdbc\\spring\\spring.xml");
		JdbcDaoImpl daoImpl = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		User user = daoImpl.getUser(3);
		System.out.println(user.toString());
		
		
	}

}
