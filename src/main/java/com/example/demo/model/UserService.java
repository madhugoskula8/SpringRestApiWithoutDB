package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	private static List<User> users=new ArrayList<>();
	private static int count=3;
	static {
		users.add(new User(1,"madhu",new Date()));
		users.add(new User(2,"shekar",new Date()));
		users.add(new User(3,"abc",new Date()));
	}
	public User addUser(User user) {
		if(user.getId()==0) {
			user.setId(++count);
		}
		users.add(user);
		return user;
	}
	public void updateUser(User user) {
		users.add(user);
	}
	public void deleteUser(int id) {
		Iterator<User> itr=users.iterator();
		while(itr.hasNext()) {
			User user=itr.next();
			if(user.getId()==id) {
				users.remove(id);
			}
		}
	}
	
	public User getUser(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	public List<User> getAllUsers(){
		return users;
	}
	
}







