package br.com.csh.model.repository.impl;

import java.util.Collection;

import br.com.csh.model.bean.EstadoBean;
import br.com.csh.model.repository.EstadoRepository;

public class EstadoRepositoryImpl extends
		GenericRepositoryImpl<EstadoBean, Integer> implements
		EstadoRepository {
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<EstadoBean> buscarPorDescricao(String descricao) {
		return em
				.createNamedQuery("EstadoBean.buscarPorDescricao",
						EstadoBean.class)
				.setParameter("descricao", "%" + descricao.toUpperCase() + "%")
				.getResultList();
	}

}