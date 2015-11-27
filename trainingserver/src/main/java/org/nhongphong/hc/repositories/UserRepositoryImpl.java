package org.nhongphong.hc.repositories;

import java.util.ArrayList;
import java.util.List;

import org.nhongphong.hc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class UserRepositoryImpl  implements UserRepositoryCustom {
	private static String USER_NAME = "userName";
	@Autowired
	private MongoOperations mongoOperations;

	@Override
	public int totalDocument() {
		List<User> users = new ArrayList<User>();
		users = mongoOperations.findAll(User.class);
		return users.size();
	}
	@Override
	public User read(User t) {
		
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User update(User t) {
		Query q = new Query(Criteria.where(USER_NAME).is(t.getUsername()));
		User u = mongoOperations.findOne(q,User.class);
		if(u!=null){
			u.setUsername(t.getUsername());
			u.setPassword(t.getPassword());
			mongoOperations.save(u);
		}
		return u;
	}
	@Override
	public User create(User t) {
		mongoOperations.save(t);
		return mongoOperations.find(new Query(Criteria.where(USER_NAME).is(t.getUsername())), User.class).get(0);
	}
}
