package org.nhongphong.hc.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface HCCrudRepository<T,Object> {
	void create(T t);
	T read(ObjectId id);
	void update (T t);
	void delete(T t);
}
