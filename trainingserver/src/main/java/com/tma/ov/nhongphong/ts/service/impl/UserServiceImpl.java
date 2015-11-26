package com.tma.ov.nhongphong.ts.service.impl;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.tma.ov.nhongphong.ts.model.User;
import com.tma.ov.nhongphong.ts.repositories.UserRepository;
import com.tma.ov.nhongphong.ts.service.*;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> getUserByUserName(String username) {
		return userRepository.findByUserName(username);
	}
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	@Override
	public User findOne() {
		return userRepository.findOne("{'username': 'nhongphong'}");
	}
	

}
