package org.nhongphong.hc.service.impl;
import java.util.List;

import org.nhongphong.hc.model.User;
import org.nhongphong.hc.repositories.UserRepository;
import org.nhongphong.hc.service.UserService;
import org.nhongphong.hc.util.RequestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public User getUserByUserName(String username) {
		return null;
	}
	@Override
	public List<User> getAllUsers() {
		return null;
	}
	@Override
	public void crud(Object o, RequestType r) {
	}
	
}