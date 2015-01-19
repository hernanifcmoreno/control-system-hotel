package br.com.csh.model.repository;

import java.io.Serializable;
import java.util.Collection;

public interface GenericRepository<Entity, Key> extends Serializable {

	void save(Entity element);

	void update(Entity element);

	void delete(Entity element);

	Entity FindById(Key key);

	Collection<Entity> findAll();

	int count();
	
	void beginTransaction();
	
	void commit();
	
	void rollback();
	
}
