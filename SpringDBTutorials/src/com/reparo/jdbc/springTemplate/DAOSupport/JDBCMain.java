package com.reparo.jdbc.springTemplate.DAOSupport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reparo.jdbc.model.User;

public class JDBCMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com\\reparo\\jdbc\\springTemplate\\DAOSupport\\spring.xml");
		JdbcDaoImpl daoImpl = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

		for (User user2 : daoImpl.getAllUers()) {
			System.out.println(user2);
		}

	}

}
