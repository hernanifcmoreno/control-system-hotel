package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.TipoLogradouroBean;

@RequestScoped
public interface TipoLogradouroRepository extends
		GenericRepository<TipoLogradouroBean, Integer> {

}