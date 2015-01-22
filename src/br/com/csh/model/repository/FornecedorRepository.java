package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.FornecedorBean;

@RequestScoped
public interface FornecedorRepository extends
		GenericRepository<FornecedorBean, Integer> {

}