package br.com.csh.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.EstadoBean;

@RequestScoped
public interface EstadoService extends GenericService<EstadoBean, Integer> {

	Collection<EstadoBean> buscarPorDescricao(String descricao);
}
