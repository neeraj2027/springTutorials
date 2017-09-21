package com.reparo.jdbc.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reparo.jdbc.model.User;

@Component
public class JdbcDaoImpl {
	
	@Autowired
	DataSource dataSource;

	public User getUser(int argId) {

		Connection connection = null;
		User user = null;
		try {
			/*
			 * Comment properties defined or moved to springbean defninition XML String
			 * driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			 * 
			 * Class.forName(driver).newInstance(); connection =
			 * DriverManager.getConnection(
			 * "jdbc:sqlserver://localhost;user=pos;password=pos;database=testUser");
			 */
			connection = dataSource.getConnection();
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

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
