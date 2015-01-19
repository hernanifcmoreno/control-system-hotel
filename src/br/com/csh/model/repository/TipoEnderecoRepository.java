package br.com.csh.model.repository;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.TipoEnderecoBean;

@RequestScoped
public interface TipoEnderecoRepository extends GenericRepository<TipoEnderecoBean, Integer> {

	Collection<TipoEnderecoBean> buscarPorDescricao(String descricao);
	
}
