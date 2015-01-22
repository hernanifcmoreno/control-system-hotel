package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.FuncionarioBean;

@RequestScoped
public interface FuncionarioRepository extends
		GenericRepository<FuncionarioBean, Integer> {

}