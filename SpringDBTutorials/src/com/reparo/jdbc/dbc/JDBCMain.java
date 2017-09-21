package com.reparo.jdbc.dbc;

import com.reparo.jdbc.model.User;

public class JDBCMain {

	public static void main(String[] args) {
		
		User user = new JdbcDaoImpl().getUser(3);
		
		System.out.println(user.toString());
		
		
	}

}
