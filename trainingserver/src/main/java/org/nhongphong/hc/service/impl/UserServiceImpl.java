package org.nhongphong.hc.service.impl;
import org.nhongphong.hc.model.User;
import org.nhongphong.hc.repositories.UserRepository;
import org.nhongphong.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUserByName(String username) {
		return userRepository.findByUserName(username);
	}

	@Override
	public int totalUsers() {
		return userRepository.totalDocument();
	}

	@Override
	public User create(User t) {
		userRepository.create(t);
		return userRepository.findByUserName(t.getUsername());
	}

	@Override
	public User read(User t) {
		return userRepository.findByUserName(t.getUsername());
	}

	@Override
	public User update(User t) {

		return userRepository.update(t);
	}
	
}