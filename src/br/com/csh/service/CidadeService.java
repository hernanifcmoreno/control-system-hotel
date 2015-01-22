package br.com.csh.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.CidadeBean;

@RequestScoped
public interface CidadeService extends GenericService<CidadeBean, Integer> {

	Collection<CidadeBean> buscarPorDescricao(String descricao);
}
