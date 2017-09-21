package com.reparo.jdbc.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.reparo.jdbc.model.User;

public class JdbcDaoImpl {
	
	public User getUser(int argId) {
		
		Connection connection = null;
		User user = null;
		
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost;user=pos;password=pos;database=testUser");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from users where id=?");
			preparedStatement.setInt(1, argId);
			ResultSet set = preparedStatement.executeQuery();
			
			while (set.next()) {
				
				user = new User(argId, set.getString("name"), set.getString("profession"));
				
			}
			set.close();
			preparedStatement.close();
			connection.close();
			return user;
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
		
	}

}
