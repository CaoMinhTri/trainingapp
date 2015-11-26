package org.nhongphong.hc.service;

import java.util.List;

import org.nhongphong.hc.model.User;
import org.nhongphong.hc.util.RequestType;

public interface UserService {
	public User getUserByUserName(String username);
	public List<User> getAllUsers();
	public void crud(Object o, RequestType r);
}
