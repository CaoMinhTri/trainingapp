package org.nhongphong.hc.repositories;

import org.bson.types.ObjectId;
import org.nhongphong.hc.model.User;

public interface UserRepository extends BaseRepository<User, ObjectId>, UserRepositoryCustom {
	public User findByUserName(String username);
}
