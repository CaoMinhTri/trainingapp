package com.tma.ov.nhongphong.ts.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.tma.ov.nhongphong.ts.model.User;

public class Init {
	@Autowired
	private MongoTemplate mongoTemplate;
	public void init(){
		User u = new User();
		u.setUsername("admin");
		u.setPassword("123456");
		u.setDateCreate(new Date().toString());
		mongoTemplate.insert(u, "user");
	}
}
