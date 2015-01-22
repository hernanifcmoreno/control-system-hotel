package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.EstadoCivilBean;

@RequestScoped
public interface EstadoCivilRepository extends GenericRepository<EstadoCivilBean, Integer> {
	
}