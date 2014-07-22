package com.javahash.service;

import com.javahash.hibernate.User;

public interface UserDao {
	
	void save(User user);
	void delete(User user);
	void update(User user);

}
