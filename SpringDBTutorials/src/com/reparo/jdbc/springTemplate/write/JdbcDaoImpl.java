package com.reparo.jdbc.springTemplate.write;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.reparo.jdbc.model.User;

@Component
public class JdbcDaoImpl {
	
	DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	public User getUser(int argId) {

		Connection connection = null;
		User user = null;
		/*
		 * Comment properties defined or moved to springbean defninition XML String
		 * driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		 * 
		 * Class.forName(driver).newInstance(); connection =
		 * DriverManager.getConnection(
		 * "jdbc:sqlserver://localhost;user=pos;password=pos;database=testUser");
		 */
		//Not usable when using JDBC template
		//connection = dataSource.getConnection();
		//PreparedStatement preparedStatement = connection.prepareStatement("select * from users where id=?");
		//preparedStatement.setInt(1, argId);
		SqlRowSet set = jdbcTemplate.queryForRowSet("select * from users where id=?",new Object[]{argId});//, new Object[]{2}
		//ResultSet set = preparedStatement.executeQuery();

		while (set.next()) {

			user = new User(argId, set.getString("name"), set.getString("profession"));

		}
		//set.close();
		//preparedStatement.close();
		//connection.close();
		return user;

	}
	
	public int getCount() {
		
		String query = "select count(*) from users";
		//jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject(query, Integer.class);
	}
	
	public User getUserbyId(int argId) {
		
		String sql = "Select * from users where id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{argId}, new UserMapper());
		
	}
	
	public List<User> getAllUers(){
		String sql = "Select * from users";
		return jdbcTemplate.query(sql, new UserMapper());
	}
	
	public void insertUser(User user) {
		String sql = "INSERT INTO users (id, name, profession) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql,new Object[] {user.getId(),user.getName(),user.getProfession()});
	}

	public void createTable() {
		String sql = "Create table circle (id INT, name VARCHAR(50), profession VARCHAR(50))";
		jdbcTemplate.update(sql);
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		//this.dataSource = dataSource;
		//either we can initialize it in spring.xml or here
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	///Mapper for mapping of values to object when using JdbcTemplate
	private static final class UserMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int arg1) throws SQLException {
			
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setProfession(rs.getString("profession"));
			return user;
		}
		
	}

}
