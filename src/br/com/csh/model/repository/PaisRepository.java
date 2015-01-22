package br.com.csh.model.repository;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.PaisBean;

@RequestScoped
public interface PaisRepository extends GenericRepository<PaisBean, Integer> {
	Collection<PaisBean> buscarPorDescricao(String descricao);
}
