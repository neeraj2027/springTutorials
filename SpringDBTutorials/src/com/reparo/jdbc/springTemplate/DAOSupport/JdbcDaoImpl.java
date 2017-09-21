package com.reparo.jdbc.springTemplate.DAOSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import com.reparo.jdbc.model.User;

public class JdbcDaoImpl extends JdbcDaoSupport {

	public List<User> getAllUers() {
		String sql = "Select * from users";
		return this.getJdbcTemplate().query(sql, new UserMapper());
		//this.getJdbcTemplate() is only used no previously used methods are required
		//
	}

	/// Mapper for mapping of values to object when using JdbcTemplate
	private static final class UserMapper implements RowMapper<User> {

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
