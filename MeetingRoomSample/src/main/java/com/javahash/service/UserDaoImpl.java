package com.javahash.service;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.javahash.hibernate.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	public void save(User user) {
	
			getHibernateTemplate().save(user);
	
		
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
