package org.nhongphong.hc.service;

import org.nhongphong.hc.model.User;
import org.nhongphong.hc.repositories.CrudRepository;

public interface UserService extends CrudRepository<User, Object> {
	public User getUserByName(String username);
	public int totalUsers();
}
