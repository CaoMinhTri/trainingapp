package org.nhongphong.hc.repositories;

public interface CrudRepository<T, Object>{
	T create(T t);
	T read(T t);
	T update(T t);
}
