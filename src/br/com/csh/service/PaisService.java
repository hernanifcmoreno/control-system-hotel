package br.com.csh.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.PaisBean;

@RequestScoped
public interface PaisService extends GenericService<PaisBean, Integer> {

	Collection<PaisBean> buscarPorDescricao(String descricao);
}
