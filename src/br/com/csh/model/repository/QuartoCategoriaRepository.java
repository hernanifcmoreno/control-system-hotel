package br.com.csh.model.repository;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.QuartoCategoriaBean;

@RequestScoped
public interface QuartoCategoriaRepository extends GenericRepository<QuartoCategoriaBean, Integer> {
	Collection<QuartoCategoriaBean> buscarPorDescricao(String descricao);
}
