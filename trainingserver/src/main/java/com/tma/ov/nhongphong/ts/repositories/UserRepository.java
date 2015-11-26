package com.tma.ov.nhongphong.ts.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tma.ov.nhongphong.ts.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	public List<User> findByUserName(String username);
	public User findByPassword(String password);

}
