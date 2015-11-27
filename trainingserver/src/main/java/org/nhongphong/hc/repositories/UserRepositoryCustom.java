package org.nhongphong.hc.repositories;

import org.nhongphong.hc.model.User;

public interface UserRepositoryCustom extends CrudRepository<User, Object>{
	public int totalDocument();
}
