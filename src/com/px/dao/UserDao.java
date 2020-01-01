package com.px.dao;

import com.px.entity.User;

public interface UserDao {

	User loginUser(User user);

	User findOne(int adminID);

	boolean updatePsswd(User user);

}
