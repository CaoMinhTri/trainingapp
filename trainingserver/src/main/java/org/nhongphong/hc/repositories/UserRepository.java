package org.nhongphong.hc.repositories;

import java.util.List;

import org.nhongphong.hc.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
	public List<User> findByUserName(String username);
	public User findByPassword(String password);

}
