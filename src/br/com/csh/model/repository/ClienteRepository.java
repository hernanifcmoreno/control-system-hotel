package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.PessoaBean;

@RequestScoped
public interface ClienteRepository extends GenericRepository<PessoaBean, Integer> {
	
}
