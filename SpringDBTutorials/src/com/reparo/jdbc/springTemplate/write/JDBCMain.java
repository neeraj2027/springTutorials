package com.reparo.jdbc.springTemplate.write;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reparo.jdbc.model.User;

public class JDBCMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\reparo\\jdbc\\springTemplate\\write\\spring.xml");
		JdbcDaoImpl daoImpl = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		User user = daoImpl.getUser(3);
		System.out.println(user.toString());
		
		User user1 = daoImpl.getUserbyId(2);
		System.out.println(user1);
		
		System.out.println(daoImpl.getCount());
		
		daoImpl.insertUser(new User(5,"Manishddd","SdddE"));
		
		
		for (User user2 : daoImpl.getAllUers()) {
			System.out.println(user2);
		}
		
		System.out.println(daoImpl.getCount());
		
		daoImpl.createTable();
		
	}

}
