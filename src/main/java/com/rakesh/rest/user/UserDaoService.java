package com.rakesh.rest.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static  List<User> users = new ArrayList<User>();
	
	/*
	 * static{ users.add(new User(1,"Adam", new Date())); users.add(new
	 * User(2,"Jack", new Date())); users.add(new User(3,"Smith", new Date())); }
	 */

	public List<User> findAll() {
		return users;
	}

	public User findOne(int id) {
		for(User user: users) {
			if(user.getId()==id)
				return user;
		}
		return null;
	}

	public User save(User user) {
		
		if(user.getId()==null) {
			user.setId(users.size()+1);
		}
		users.add(user);
		return user;
	}

	public User deleteUser(int id) {
		return null;
	}

}
