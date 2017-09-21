package com.reparo.springmvc.service;

import java.sql.SQLException;

import com.reparo.springmvc.model.Login;
import com.reparo.springmvc.model.User;

/**
 * @author Neeraj
 *
 */
public interface UserService
{
	public User validateUser(Login login) throws SQLException;
	
	void register(User user);
}

