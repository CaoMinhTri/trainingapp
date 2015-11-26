package org.nhongphong.hc.repositories.impl;

import org.bson.types.ObjectId;
import org.nhongphong.hc.repositories.HCCrudRepository;
import org.springframework.data.mongodb.core.MongoOperations;


public class DBCrudRepository<T> implements HCCrudRepository<T, Object> {

	private MongoOperations mongoOps;

	@Override
	public void create(T t) {
		mongoOps.save(t);
	}

	@Override
	public void update(T t) {
		mongoOps.insert(t);
	}

	@Override
	public void delete(T t) {
		mongoOps.remove(t);
	}

	@Override
	public T read(ObjectId id) {
		return null;
	}

	

}
