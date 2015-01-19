package br.com.csh.service.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManagerFactory {

	
	@ApplicationScoped
	@Produces
	public EntityManagerFactory createFactory(){
		return Persistence.createEntityManagerFactory("cshPU");
	}
	
}