package br.com.csh.service;

import java.io.Serializable;
import java.util.Collection;

public interface GenericService<Entity, Key> extends Serializable{
	void save(Entity element);
	
	void update(Entity element);
	
	void delete(Entity element);
	
	Entity findById(Key key);
	
	Collection<Entity> findAll();

}

