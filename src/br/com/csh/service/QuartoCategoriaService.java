package br.com.csh.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.QuartoCategoriaBean;

@RequestScoped
public interface QuartoCategoriaService extends GenericService<QuartoCategoriaBean, Integer> {

	Collection<QuartoCategoriaBean> buscarPorDescricao(String descricao);
}
