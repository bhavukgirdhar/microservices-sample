package com.user.controller.util;

import com.user.dao.pojo.User;
import com.user.services.iface.IUserService;

public class UserControllerUtil {

	public static User create(IUserService userService, User user) {
		
		user = new User();
		user.setUsername("bhavuk");
		user.setPassword("111");
		user.setUser_type("0");
		
		return userService.createUser(user);
	}
}
