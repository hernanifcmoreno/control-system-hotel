package br.com.csh.model.repository;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.CidadeBean;

@RequestScoped
public interface CidadeRepository extends GenericRepository<CidadeBean, Integer> {
	Collection<CidadeBean> buscarPorDescricao(String descricao);
}
