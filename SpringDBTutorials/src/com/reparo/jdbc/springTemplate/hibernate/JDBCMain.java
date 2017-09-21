package com.reparo.jdbc.springTemplate.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reparo.jdbc.model.User;

public class JDBCMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com\\reparo\\jdbc\\springTemplate\\hibernate\\spring.xml");
		//JdbcDaoImpl daoImpl = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		HibernateDaoImpl daoImpl = applicationContext.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		
		System.out.println(daoImpl.getAllUers());

	}

}
