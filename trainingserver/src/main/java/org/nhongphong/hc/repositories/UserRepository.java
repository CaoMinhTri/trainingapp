package org.nhongphong.hc.repositories;

import org.nhongphong.hc.model.User;


public interface UserRepository extends BaseRepository<User, String>, UserCustomeRepository{
	public User findByUserName(String username);
	public User findByPassword(String password);

}
