package org.nhongphong.hc.service.impl;
import java.util.List;

import org.nhongphong.hc.model.User;
import org.nhongphong.hc.repositories.UserRepository;
import org.nhongphong.hc.repositories.impl.DBCrudRepository;
import org.nhongphong.hc.service.UserService;
import org.nhongphong.hc.util.RequestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	private DBCrudRepository<User> dbcrud;
	@Autowired
	private UserRepository userRepository;
	@Override
	public User getUserByUserName(String username) {
		return userRepository.findByUserName(username);
	}
	@Override
	public List<User> getAllUsers() {
		return null;
	}
	@Override
	public void crud(Object o, RequestType r) {
		dbcrud = new DBCrudRepository<>();
		switch (r) {
		case REQUEST_CREATE:
			dbcrud.create((User) o);
			break;
		case REQUEST_DELETE:
			dbcrud.delete((User) o);
			break;
		case REQUEST_UPDATE:
			dbcrud.update((User) o);
			break;
		default:
			break;
		
		}
	}
	
}