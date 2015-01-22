package br.com.csh.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.TipoEnderecoBean;

@RequestScoped
public interface TipoEnderecoService extends GenericService<TipoEnderecoBean, Integer> {

	Collection<TipoEnderecoBean> buscarPorDescricao(String descricao);
}
