package com.user.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.database.hibernate.dao.impl.GenericHibernateDAOImpl;
import com.user.dao.iface.IUserDAO;
import com.user.dao.pojo.User;

@Repository
public class UserDAOImpl extends GenericHibernateDAOImpl<User> implements IUserDAO{

	@Override
	public List<User> getByGroupId(Integer groupId) {		
		return null;
	}

	@Override
	public User createUser(User user) {
		//TODO : Modify if required.
		return create(user);// Called from AbstractHibernateDao because this has been extended by GenericHibernateDAO.
	}
	
}
