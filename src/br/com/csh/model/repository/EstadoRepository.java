package br.com.csh.model.repository;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import br.com.csh.model.bean.EstadoBean;

@RequestScoped
public interface EstadoRepository extends GenericRepository<EstadoBean, Integer> {
	Collection<EstadoBean> buscarPorDescricao(String descricao);
}
