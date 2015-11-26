package org.nhongphong.hc.service.impl;
import java.util.List;

import org.nhongphong.hc.model.User;
import org.nhongphong.hc.repositories.UserRepository;
import org.nhongphong.hc.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
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
