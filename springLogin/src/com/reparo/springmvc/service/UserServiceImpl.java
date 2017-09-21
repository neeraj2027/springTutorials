package com.reparo.springmvc.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.reparo.springmvc.dao.UserDao;
import com.reparo.springmvc.model.Login;
import com.reparo.springmvc.model.User;

public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao userDao;

	public UserDao getUserDao()
	{
		return this.userDao;
	}

	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

	@Override
	public User validateUser(Login login) throws SQLException
	{
		return userDao.validateUser(login);
	}

	@Override
	public void register(User user) {
		userDao.register(user);
	}

}

