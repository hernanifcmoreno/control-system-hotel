package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.QuartoBean;

@RequestScoped
public interface QuartoRepository extends
		GenericRepository<QuartoBean, Integer> {

}