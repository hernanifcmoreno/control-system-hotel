package br.com.csh.model.repository;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.ProfissaoBean;

@RequestScoped
public interface ProfissaoRepository extends
		GenericRepository<ProfissaoBean, Integer> {

}