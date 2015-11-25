package com.tma.ov.nhongphong.ts.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tma.ov.nhongphong.ts.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	public User findByUserName(String username);

}
