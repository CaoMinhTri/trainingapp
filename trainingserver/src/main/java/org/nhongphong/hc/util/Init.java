package org.nhongphong.hc.util;

import java.util.Date;

import org.nhongphong.hc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

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
