package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.TipoTelefoneBean;

@RequestScoped
public interface TipoTelefoneRepository extends
		GenericRepository<TipoTelefoneBean, Integer> {

}