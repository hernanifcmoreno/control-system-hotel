package br.com.csh.service.producer;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.csh.service.qualifier.Persistencia;

public class PersistenceManager {

	@Inject
	EntityManagerFactory emf;

	@Persistencia
	@Produces
	@RequestScoped
	public EntityManager createEntityManager() {
		return emf.createEntityManager();
	}
}
