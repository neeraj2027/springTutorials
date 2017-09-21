package com.reparo.springmvc.dao;
import com.reparo.springmvc.model.Login;
import com.reparo.springmvc.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);

}