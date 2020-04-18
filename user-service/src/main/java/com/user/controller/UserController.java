package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.controller.util.UserControllerUtil;
import com.user.dao.pojo.User;
import com.user.services.iface.IUserService;

@RestController
public class UserController {

	@Autowired
	IUserService userService;

	@GetMapping(value = "/create")
	public User create() {
		return UserControllerUtil.create(userService, null);
	}
	
}
