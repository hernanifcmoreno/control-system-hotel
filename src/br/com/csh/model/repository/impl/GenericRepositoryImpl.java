package br.com.csh.model.repository.impl;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.csh.model.repository.GenericRepository;
import br.com.csh.service.qualifier.Persistencia;

public class GenericRepositoryImpl<Entity, Key> implements
		GenericRepository<Entity, Key> {
	private static final long serialVersionUID = 1L;

	@Inject
	@Persistencia
	protected EntityManager em;

	@Override
	public void save(Entity element) {
		em.persist(element);
		em.flush();
	}

	@Override
	public void update(Entity element) {
		em.merge(element);
		em.flush();
	}

	@Override
	public void delete(Entity element) {
		em.remove(element);
		em.flush();

	}

	@SuppressWarnings("unchecked")
	@Override
	public Entity FindById(Key key) {
		return (Entity) em.find(getTypeClass(), key);
	}

	@SuppressWarnings("unchecked")
	public Collection<Entity> findAll() {
		return em.createQuery(("FROM " + getTypeClass().getSimpleName()))
				.getResultList();
	}

	@Override
	public int count() {
		String jpql = "SELECT COUNT(C) FROM " + getTypeClass().getSimpleName()
				+ " C ";
		@SuppressWarnings("unchecked")
		TypedQuery<Entity> query = (TypedQuery<Entity>) em.createQuery(jpql,
				getTypeClass());
		return query.getFirstResult();
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();

	}

	@Override
	public void commit() {
		em.getTransaction().commit();

	}

	@Override
	public void rollback() {
		em.getTransaction().rollback();

	}

	private Class<?> getTypeClass() {
		Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		return clazz;
	}
}
