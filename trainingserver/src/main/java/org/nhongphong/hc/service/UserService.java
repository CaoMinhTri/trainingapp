package org.nhongphong.hc.service;

import java.util.List;

import org.nhongphong.hc.model.User;

public interface UserService {
	public List<User> getUserByUserName(String username);
	public List<User> getAllUsers();
	public User findOne();
}
