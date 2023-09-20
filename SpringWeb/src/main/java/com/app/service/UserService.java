package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public int createUser(User user) {
		return this.userDao.insert(user);
	}
}
