package com.reparo.jdbc.springTemplate.READ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reparo.jdbc.model.User;

public class JDBCMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\reparo\\jdbc\\springTemplate\\READ\\spring.xml");
		JdbcDaoImpl daoImpl = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		User user = daoImpl.getUser(3);
		System.out.println(user.toString());
		
		User user1 = daoImpl.getUserbyId(2);
		System.out.println(user1);
		
		System.out.println(daoImpl.getCount());
		
		System.out.println(daoImpl.getAllUers().size());
		
		for (User user2 : daoImpl.getAllUers()) {
			System.out.println(user2);
		}
		
		
	}

}
