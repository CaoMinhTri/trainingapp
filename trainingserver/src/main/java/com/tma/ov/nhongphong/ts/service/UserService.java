package com.tma.ov.nhongphong.ts.service;

import java.util.List;

import com.tma.ov.nhongphong.ts.model.User;

public interface UserService {
	public List<User> getUserByUserName(String username);
	public List<User> getAllUsers();
	public User findOne();
}
