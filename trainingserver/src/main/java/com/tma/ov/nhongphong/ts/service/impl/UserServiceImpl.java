package com.tma.ov.nhongphong.ts.service.impl;
import org.springframework.beans.factory.annotation.Autowired;

import com.tma.ov.nhongphong.ts.model.User;
import com.tma.ov.nhongphong.ts.repositories.UserRepository;
import com.tma.ov.nhongphong.ts.service.*;
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User getUserByUserName(String username) {
		
		return userRepository.findByUserName(username);
	}

}
