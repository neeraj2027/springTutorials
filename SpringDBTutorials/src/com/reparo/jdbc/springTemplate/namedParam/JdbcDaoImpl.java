package com.reparo.jdbc.springTemplate.namedParam;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.reparo.jdbc.model.User;

@Component
public class JdbcDaoImpl {

	DataSource dataSource;

	// private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	// or we can use SimpleJdbcTemplate

	public List<User> getAllUers() {
		String sql = "Select * from users";
		return namedJdbcTemplate.query(sql, new UserMapper());
	}

	public void insertUser(User user) {
		String sql = "INSERT INTO users (id, name, profession) VALUES (:id, :name, :profession)";
		SqlParameterSource map = new MapSqlParameterSource("id", user.getId()).addValue("name", user.getName())
				.addValue("profession", user.getProfession());
		namedJdbcTemplate.update(sql, map);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		// this.dataSource = dataSource;
		// either we can initialize it in spring.xml or here
		this.namedJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return namedJdbcTemplate;
	}

	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.namedJdbcTemplate = jdbcTemplate;
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
