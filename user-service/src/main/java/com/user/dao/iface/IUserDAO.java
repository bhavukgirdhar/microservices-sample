package com.user.dao.iface;

import java.util.List;

import com.user.dao.pojo.User;

public interface IUserDAO  {

	public List<User> getByGroupId(Integer groupId);
	
	public User createUser(User user);
}
