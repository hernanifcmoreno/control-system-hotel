package br.com.csh.service;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.TipoEnderecoBean;

@RequestScoped
public interface TipoEnderecoService extends Serializable{
	
	void save(TipoEnderecoBean element);
	
	void update(TipoEnderecoBean element);
	
	void delete(TipoEnderecoBean element);
	
	TipoEnderecoBean findById(Integer key);
	
	Collection<TipoEnderecoBean> findAll();
	
	Collection<TipoEnderecoBean> buscarPorDescricao(String descricao);
}
