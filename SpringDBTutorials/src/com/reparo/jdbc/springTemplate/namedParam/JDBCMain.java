package com.reparo.jdbc.springTemplate.namedParam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reparo.jdbc.model.User;

public class JDBCMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com\\reparo\\jdbc\\springTemplate\\namedParam\\spring.xml");
		JdbcDaoImpl daoImpl = applicationContext.getBean("jdbcDaoImpl", JdbcDaoImpl.class);

		daoImpl.insertUser(new User(6, "RAVI", "SEE"));

		for (User user2 : daoImpl.getAllUers()) {
			System.out.println(user2);
		}

	}

}
