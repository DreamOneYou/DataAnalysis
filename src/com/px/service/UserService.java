package com.px.service;

import org.springframework.transaction.annotation.Transactional;

import com.px.dao.UserDao;
import com.px.entity.User;
@Transactional
public class UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user) {

		return userDao.loginUser(user);
	}

	public void updatePasswd() {
	
		
	}

	public User findOne(int adminID) {
		return userDao.findOne(adminID);
	}

	public boolean updatePsswd(User user) {
		return userDao.updatePsswd(user);
		
	}

}
