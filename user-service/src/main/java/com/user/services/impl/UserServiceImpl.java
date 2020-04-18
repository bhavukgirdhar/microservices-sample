package com.user.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.iface.IUserDAO;
import com.user.dao.pojo.User;
import com.user.services.iface.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserDAO userDao;
	
	@Override
	public User createUser(User user) {
		return userDao.createUser(user);
	}

}
